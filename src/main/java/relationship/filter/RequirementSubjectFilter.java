package relationship.filter;

import basic.StudentEntity;
import basic.SubjectEntity;
import dao.StudentDao;
import dao.SubjectDao;

public class RequirementSubjectFilter {
    public boolean canEnroll(Long student, Long subject) {
        StudentDao studentDao = new StudentDao();
        SubjectDao subjectDao = new SubjectDao();

        StudentEntity studentEntity = studentDao.find(student);
        SubjectEntity subjectEntity = subjectDao.find(subject);
        return false;
    }
}
