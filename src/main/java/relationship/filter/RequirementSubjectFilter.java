package relationship.filter;

import basic.SubjectEntity;
import dao.RequirementSubjectDao;
import dao.SubjectDao;
import relationship.RequirementSubjectRelationship;

import java.util.List;
import java.util.stream.Collectors;

public class RequirementSubjectFilter {
    public boolean canEnroll(Long student, Long subject) {
        SubjectDao subjectDao = new SubjectDao();
        ApprovedFilter approvedDao = new ApprovedFilter();
        RequirementSubjectDao requirementSubjectDao = new RequirementSubjectDao();

        List<RequirementSubjectRelationship> subjects = requirementSubjectDao.all();
        List<SubjectEntity> requirements = subjects.stream()
                .filter(o -> subject.equals(o.getSubject()))
                .map(x -> subjectDao.find(x.getParent()))
                .collect(Collectors.toList());

        List<SubjectEntity> approveds = approvedDao.approvedsFromStudent(student);

        long sum = requirements.stream()
                .mapToLong(o ->
                        (approveds.stream().anyMatch(a -> a.equals(o))) ? 0 : 1)
                .sum();
        return sum == 0;
    }
}
