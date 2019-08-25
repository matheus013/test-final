package functional;

import basic.StudentEntity;
import basic.SubjectEntity;
import dao.CourseDao;
import dao.MatriculateDao;
import dao.StudentDao;
import lombok.Getter;
import lombok.Setter;
import relationship.MatriculateRelationship;
import relationship.filter.OfferedFilter;
import relationship.filter.RequirementCreditFilter;

import java.util.List;
import java.util.Objects;

@Getter
@Setter
public class Matriculation {
    private List studentAvailable;
    private StudentEntity selectedStudent;
    StudentDao studentDao;
    List<SubjectEntity> offer;

    public Matriculation() {
        studentDao = new StudentDao();
    }

    public List start() {
        studentAvailable = studentDao.all();
        return studentAvailable;
    }

    public List<SubjectEntity> getSubjects() {
        if (studentAvailable == null || selectedStudent == null)
            return null;
        long course = selectedStudent.getCourse();
        CourseDao courseDao = new CourseDao();
        long department = courseDao.find(course).getDepartment();
        OfferedFilter offeredFilter = new OfferedFilter();
        offer = offeredFilter.fromDepartmentToStudent(department, selectedStudent.getId());
        return offer;
    }

    public Boolean doMatriculation() {
        if (offer == null)
            return false;

        MatriculateDao matriculateDao = new MatriculateDao();
        RequirementCreditFilter requirement = new RequirementCreditFilter();
        offer.stream().forEach(x -> {
                    if (Objects.equals(selectedStudent.getLevel(), x.getLevel())) {
                        matriculateDao
                                .save(new MatriculateRelationship(selectedStudent.getId(), x.getId()));
                    } else if (selectedStudent.getLevel() < x.getLevel()
                            && requirement.toMasterSubject(selectedStudent.getId())) {
                        matriculateDao
                                .save(new MatriculateRelationship(selectedStudent.getId(), x.getId()));
                    }
                }
        );
        return true;
    }


}
