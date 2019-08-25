package relationship.filter;

import basic.SubjectEntity;
import dao.CourseDao;
import dao.OfferedDao;

import java.util.List;
import java.util.stream.Collectors;

public class OfferedFilter {
    private OfferedDao offeredDao;

    public OfferedFilter() {
        offeredDao = new OfferedDao();
    }

    public List fromCourse(Long course) {
        List<SubjectEntity> list = offeredDao.all();

        return list.stream().filter(o -> course.equals(o.getCourse()))
                .collect(Collectors.toList());
    }

    public List fromDepartment(Long department) {
        List<SubjectEntity> list = offeredDao.all();
        CourseDao courseDao = new CourseDao();


        return list.stream()
                .filter(o -> department.equals(courseDao.find(o.getCourse()).getDepartment()))
                .collect(Collectors.toList());
    }

    public List fromCourseToStudent(Long course, Long student) {
        RequirementCreditFilter requirementCredit = new RequirementCreditFilter();
        RequirementSubjectFilter requirementSubject = new RequirementSubjectFilter();
        List<SubjectEntity> offerFromCourse = fromCourse(course);

        List<SubjectEntity> offerToStudent = offerFromCourse.stream()
                .filter(o -> requirementCredit.canEnroll(student, o.getId()) &&
                        requirementSubject.canEnroll(student, o.getId()))
                .collect(Collectors.toList());
        return offerToStudent;
    }

    public List fromDepartmentToStudent(Long department, Long student) {
        RequirementCreditFilter requirementCredit = new RequirementCreditFilter();
        RequirementSubjectFilter requirementSubject = new RequirementSubjectFilter();
        List<SubjectEntity> offerFromCourse = fromDepartment(department);

        List<SubjectEntity> offerToStudent = offerFromCourse.stream()
                .filter(o -> requirementCredit.canEnroll(student, o.getId()) &&
                        requirementSubject.canEnroll(student, o.getId()))
                .collect(Collectors.toList());
        return offerToStudent;
    }
}
