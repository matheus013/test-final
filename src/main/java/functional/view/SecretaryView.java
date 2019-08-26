package functional.view;

import basic.SecretaryEntity;
import basic.SubjectEntity;
import dao.SubjectDao;
import lombok.Getter;
import lombok.Setter;
import relationship.RequirementSubjectRelationship;
import relationship.filter.OfferedFilter;
import relationship.filter.RequirementCreditFilter;
import relationship.filter.RequirementSubjectFilter;

import java.util.List;
import java.util.stream.Collectors;

@Setter
@Getter
public class SecretaryView {
    private SecretaryEntity secretaryEntity;

    @Override
    public String toString() {
        if (getSecretaryEntity() == null)
            return "";
        if (!getSecretaryEntity().validation())
            return "";
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("Secretary\n").append("type: ");
        if (getSecretaryEntity().getLevel() == 2)
            stringBuilder.append("master's degree\n");
        else if (getSecretaryEntity().getLevel() == 1)
            stringBuilder.append("graduate\n");

        OfferedFilter offeredFilter = new OfferedFilter();
        SubjectDao subjectDao = new SubjectDao();

        List<SubjectEntity> subjects = offeredFilter.fromDepartment(getSecretaryEntity().getDepartment());

        stringBuilder.append("subjects offered\n");

        subjects.forEach(o -> {
            RequirementSubjectFilter requirement = new RequirementSubjectFilter();
            RequirementCreditFilter requirementCredit = new RequirementCreditFilter();

            List<RequirementSubjectRelationship> requirementSubjects = requirement.fromSubject(o.getId());

            String str = requirementSubjects.stream().map(x -> subjectDao.find(x.getParent()).getCode())
                    .collect(Collectors.joining(" | "));

            stringBuilder
                    .append("\tcode: ").append(o.getCode()).append("\n")
                    .append("\tcredits: ").append(o.getCredit()).append("\n")
                    .append("\tcredit requirement: ").append(requirementCredit.fromSubject(o.getId())).append("\n")
                    .append("\tsubjects requirement: ").append(str).append("\n")
                    .append("\tname: ").append(o.getName()).append("\n");
        });
        return stringBuilder.toString();
    }
}
