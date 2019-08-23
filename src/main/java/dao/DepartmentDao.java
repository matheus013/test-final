package dao;

import basic.DepartmentEntity;

public class DepartmentDao extends GenericDao<DepartmentEntity, Long> {
    public DepartmentDao() {
        super(DepartmentEntity.class);
    }
}
