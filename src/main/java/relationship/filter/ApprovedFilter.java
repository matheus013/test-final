package relationship.filter;

import dao.ApprovedDao;
import dao.SubjectDao;
import relationship.ApprovedRelationship;

import java.util.List;
import java.util.stream.Collectors;

public class ApprovedFilter {

    public List approvedsFromStudent(Long student) {
        ApprovedDao approvedDao = new ApprovedDao();
        SubjectDao subjectDao = new SubjectDao();
        List<ApprovedRelationship> approvedList = approvedDao.all();

        return approvedList.stream()
                .filter(o -> student.equals(o.getStudent()))
                .map(x -> subjectDao.find(x.getSubject()))
                .collect(Collectors.toList());
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
