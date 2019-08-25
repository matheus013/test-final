package functional.view;

import basic.StudentEntity;
import basic.SubjectEntity;
import lombok.Getter;
import lombok.Setter;
import relationship.filter.MatriculateFilter;

import java.util.List;

@Setter
@Getter
public class StudentView {
    private StudentEntity studentEntity;

    public StudentView(StudentEntity studentEntity) {
        this.studentEntity = studentEntity;
    }

    @Override
    public String toString() {
        if (studentEntity == null)
            return "";
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("registration: ").append(studentEntity.getRegistration()).append("\n");
        stringBuilder.append("name: ").append(studentEntity.getName()).append("\n");

        MatriculateFilter matriculateFilter = new MatriculateFilter();
        List subjects = matriculateFilter.subjectMatriculateFrom(studentEntity.getId());

        subjects.forEach(o -> {
            SubjectEntity entity = (SubjectEntity) o;
            stringBuilder.append("\t").append(entity.getCode()).append(" : ").append(entity.getName()).append("\n");
        });


        return stringBuilder.toString();
    }
}
