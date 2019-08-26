package functional.view;

import basic.StudentEntity;
import basic.SubjectEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import relationship.filter.MatriculateFilter;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
public class StudentView {
    private StudentEntity studentEntity;

    public StudentView(StudentEntity studentEntity) {
        this.studentEntity = studentEntity;
    }

    @Override
    public String toString() {
        if (getStudentEntity() == null)
            return "";

        if (!getStudentEntity().validation())
            return "";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Student\n");
        stringBuilder.append("registration: ").append(getStudentEntity().getRegistration()).append("\n");
        stringBuilder.append("name: ").append(getStudentEntity().getName()).append("\n");

        MatriculateFilter matriculateFilter = new MatriculateFilter();
        List subjects = matriculateFilter.subjectMatriculateFrom(getStudentEntity().getId());
        stringBuilder.append("enrolled subjects:\n");
        subjects.forEach(o -> {
            SubjectEntity entity = (SubjectEntity) o;
            if (entity.validation())
                stringBuilder.append("\t").append(entity.getCode())
                        .append(" | ").append(entity.getName()).append("\n");
        });


        return stringBuilder.toString();
    }
}
