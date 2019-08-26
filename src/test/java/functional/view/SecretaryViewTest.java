package functional.view;

import basic.DepartmentEntity;
import basic.SecretaryEntity;
import dao.DepartmentDao;
import org.junit.Test;

import static org.junit.Assert.assertNotEquals;

public class SecretaryViewTest {
    SecretaryView secretaryView = new SecretaryView();
    SubjectView subjectView = new SubjectView();
    StudentView studentView = new StudentView();

    @Test
    public void toString1() {
        SecretaryEntity secretaryUndergraduate = new SecretaryEntity((long) 0, "IC", (long) 1);
        SecretaryEntity secretaryMaster = new SecretaryEntity((long) 0, "IC", (long) 2);

        secretaryView.setSecretaryEntity(secretaryMaster);
        String master = secretaryView.toString();

        secretaryView.setSecretaryEntity(secretaryUndergraduate);
        String under = secretaryView.toString();

        assertNotEquals(master, under);
    }

    @Test
    public void toString2() {
        SecretaryEntity secretaryUndergraduate = new SecretaryEntity((long) 0, "IC", (long) 1);
        SecretaryEntity secretaryMaster = new SecretaryEntity((long) 0, "IC", (long) 2);

        DepartmentDao departmentDao = new DepartmentDao();
        departmentDao.save(new DepartmentEntity("IC", (long) 0));

        secretaryView.setSecretaryEntity(secretaryMaster);
        String master = secretaryView.toString();

        secretaryView.setSecretaryEntity(secretaryUndergraduate);
        String under = secretaryView.toString();

        assertNotEquals(master, under);
    }
}