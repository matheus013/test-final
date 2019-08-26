package functional.view;

import basic.SubjectEntity;
import basic.TeacherEntity;
import dao.StudentDao;
import dao.SubjectDao;
import dao.TeacherDao;
import lombok.Getter;
import lombok.Setter;
import relationship.MatriculateRelationship;
import relationship.RequirementSubjectRelationship;
import relationship.filter.MatriculateFilter;
import relationship.filter.RequirementSubjectFilter;

import java.util.List;

@Setter
@Getter
public class SubjectView {
    private SubjectEntity subjectEntity;

    @Override
    public String toString() {
        if (getSubjectEntity() == null)
            return "";
        if (!getSubjectEntity().validation())
            return "";
        StringBuilder stringBuilder = new StringBuilder();
        RequirementSubjectFilter requirementSubjectFilter = new RequirementSubjectFilter();
        TeacherDao teacherDao = new TeacherDao();
        SubjectDao subjectDao = new SubjectDao();
        StudentDao studentDao = new StudentDao();
        MatriculateFilter matriculateFilter = new MatriculateFilter();

        stringBuilder.append("Subject\n");
        stringBuilder.append("registration: ").append(getSubjectEntity().getCode()).append("\n");
        stringBuilder.append("name: ").append(getSubjectEntity().getName()).append("\n");
        stringBuilder.append("credit requirement: ").append(getSubjectEntity().getCredit()).append("\n");
        TeacherEntity teacherEntity = teacherDao.find(getSubjectEntity().getId());
        if (teacherEntity.validation())
            stringBuilder.append("responsible teacher: ")
                    .append(teacherEntity.getName()).append("\n");
        stringBuilder.append("requirement subjects\n");

        List<RequirementSubjectRelationship> requirements = requirementSubjectFilter.fromSubject(subjectEntity.getId());
        requirements.forEach(o -> {
            stringBuilder.append("\t").append(subjectDao.find(o.getParent()).getCode())
                    .append(" | ").append(subjectDao.find(o.getParent()).getName()).append("\n");
        });

        stringBuilder.append("enrolled students\n");

        List<MatriculateRelationship> matriculates = matriculateFilter.studentMatriculateFrom(subjectEntity.getId());

        matriculates.forEach(o -> {
            stringBuilder.append("\t").append(studentDao.find(o.getStudent()).getRegistration())
                    .append(" | ").append(studentDao.find(o.getStudent()).getName()).append("\n");
        });
        return stringBuilder.toString();
    }
}
