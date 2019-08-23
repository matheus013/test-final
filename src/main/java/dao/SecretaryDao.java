package dao;

import basic.SecretaryEntity;

public class SecretaryDao extends GenericDao<SecretaryEntity, Long> {
    public SecretaryDao() {
        super(SecretaryEntity.class);
    }
}
