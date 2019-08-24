package dao;

import relationship.OfferedRelationship;

public class OfferedDao extends GenericDao<OfferedRelationship, Long> {
    public OfferedDao() {
        super(OfferedRelationship.class);
    }
}
