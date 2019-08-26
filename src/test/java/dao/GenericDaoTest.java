package dao;

import basic.*;
import org.junit.Test;

public class GenericDaoTest {
    private CourseDao courseDao = new CourseDao();
    private DepartmentDao departmentDao = new DepartmentDao();
    private SecretaryDao secretaryDao = new SecretaryDao();
    private StudentDao studentDao = new StudentDao();
    private SubjectDao subjectDao = new SubjectDao();
    private TeacherDao teacherDao = new TeacherDao();

    private CourseEntity courseEntity = new CourseEntity("CC", 0L, 0L);
    private DepartmentEntity departmentEntity = new DepartmentEntity("IC", 0L);
    private SecretaryEntity secretaryEntity = new SecretaryEntity(0L, "CC", 1L);
    private StudentEntity studentEntity = new StudentEntity("Matheus", "13214003", 0L,
            1L, "C3PO");
    private SubjectEntity subjectEntity = new SubjectEntity("", "intro", 0L, 0L, 60
            , true, 1L, 60L, "COMP222");
    private TeacherEntity teacherEntity = new TeacherEntity("Willy", 0L);

    @Test(expected = org.hibernate.MappingException.class)
    public void save() {
        departmentDao.save(departmentEntity);

        secretaryDao.save(secretaryEntity);

        studentDao.save(studentEntity);

        subjectDao.save(subjectEntity);

        teacherDao.save(teacherEntity);

        courseDao.save(courseEntity);

    }

    @Test(expected = org.hibernate.MappingException.class)
    public void update() {
        departmentEntity.setName("3");
        departmentDao.update(departmentEntity);

        secretaryEntity.setName("3");
        secretaryDao.update(secretaryEntity);

        studentEntity.setName("3");
        studentDao.update(studentEntity);

        subjectEntity.setName("3");
        subjectDao.update(subjectEntity);

        teacherEntity.setName("3");
        teacherDao.update(teacherEntity);

        courseEntity.setName("3");
        courseDao.update(courseEntity);

    }

    @Test(expected = org.hibernate.UnknownEntityTypeException.class)
    public void delete() {
        departmentDao.delete(0L);

        secretaryDao.delete(0L);

        studentDao.delete(0L);

        subjectDao.delete(0L);

        teacherDao.delete(0L);

        courseDao.delete(0L);
    }

}