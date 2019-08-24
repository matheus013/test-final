package relationship.filter;

import basic.StudentEntity;
import basic.SubjectEntity;
import dao.RequirementCreditDao;
import dao.StudentDao;
import dao.SubjectDao;
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
}
