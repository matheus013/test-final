package relationship.filter;

import dao.ApprovedDao;
import dao.RequirementCreditDao;
import dao.SubjectDao;
import relationship.ApprovedRelationship;
import relationship.RequirementCreditRelationship;

import java.util.List;
import java.util.stream.Collectors;

public class ApprovedFilter {
    public boolean canEnroll(Long student, Long subject) {
        ApprovedDao approvedDao = new ApprovedDao();
        List<ApprovedRelationship> list = approvedDao.all();
        return false;
    }

    public Long creditFromStudent(Long student) {
        ApprovedDao approvedDao = new ApprovedDao();
        SubjectDao subjectDao = new SubjectDao();
        List<ApprovedRelationship> list = approvedDao.all();

        List<ApprovedRelationship> approvedFromStudent = list.stream()
                .filter(o -> student.equals(o.getStudent()))
                .collect(Collectors.toList());

        Long sum = approvedFromStudent.stream()
                .mapToLong(a -> subjectDao.find(a.getSubject()).getCredit()).sum();
        return sum;
    }
}
