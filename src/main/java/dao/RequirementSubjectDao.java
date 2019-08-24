package dao;

import relationship.RequirementSubjectRelationship;

public class RequirementSubjectDao extends GenericDao<RequirementSubjectRelationship, Long> {
    public RequirementSubjectDao() {
        super(RequirementSubjectRelationship.class);
    }
}
