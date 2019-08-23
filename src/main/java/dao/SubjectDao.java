package dao;

import basic.SubjectEntity;

public class SubjectDao extends GenericDao<SubjectEntity, Long> {
    public SubjectDao() {
        super(SubjectEntity.class);
    }
}