package relationship.filter;

import dao.RequirementCreditDao;
import relationship.RequirementCreditRelationship;

import java.util.List;

public class RequirementCreditFilter {
    public RequirementCreditRelationship fromSubject(Long subject) {
        RequirementCreditDao requirementCreditDao = new RequirementCreditDao();
        List<RequirementCreditRelationship> list = requirementCreditDao.all();

        return list.stream().filter(o -> subject.equals(o.getSubject()))
                .findAny().orElse(null);
    }

    public boolean canEnroll(Long student, Long subject) {
        ApprovedFilter approvedFilter = new ApprovedFilter();

        Long studentCredits = approvedFilter.creditFromStudent(student);
        Long requirementCredits = fromSubject(subject).getCredit();

        return studentCredits >= requirementCredits;
    }

    public boolean toMasterSubject(Long student) {
        ApprovedFilter approvedFilter = new ApprovedFilter();

        Long studentCredits = approvedFilter.creditFromStudent(student);
        return studentCredits >= 170;
    }
}
