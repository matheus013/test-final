package dao;

import relationship.ApprovedRelationship;

public class ApprovedDao extends GenericDao<ApprovedRelationship, Long> {

    public ApprovedDao() {
        super(ApprovedRelationship.class);
    }
}
