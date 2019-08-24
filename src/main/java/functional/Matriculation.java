package functional;

import basic.StudentEntity;
import basic.SubjectEntity;
import dao.StudentDao;

import java.util.ArrayList;
import java.util.List;

public class Matriculation {
    private List<StudentEntity> studentAvailable;
    private StudentEntity selectedStudent;
    StudentDao studentDao;

    public Matriculation() {
        studentDao = new StudentDao();
    }

    public List<StudentEntity> start() {
        studentAvailable = new ArrayList<>(studentDao.all());
        return studentAvailable;
    }

    public void setStudent(Long id) {
        selectedStudent = studentDao.find(id);
    }

    public List<SubjectEntity> getSubjects() {
        Long courseId = selectedStudent.getCourse();
        return null;
    }
}
