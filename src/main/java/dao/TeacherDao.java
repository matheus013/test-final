package dao;

import basic.TeacherEntity;

public class TeacherDao extends GenericDao<TeacherEntity, Long> {
    public TeacherDao() {
        super(TeacherEntity.class);
    }
}