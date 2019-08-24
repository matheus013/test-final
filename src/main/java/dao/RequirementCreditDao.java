package dao;

import relationship.RequirementCreditRelationship;

public class RequirementCreditDao extends GenericDao<RequirementCreditRelationship, Long> {
    public RequirementCreditDao() {
        super(RequirementCreditRelationship.class);
    }
}
