package dao;

import basic.StudentEntity;

public class StudentDao extends GenericDao<StudentEntity, Long> {
    public StudentDao() {
        super(StudentEntity.class);
    }
}