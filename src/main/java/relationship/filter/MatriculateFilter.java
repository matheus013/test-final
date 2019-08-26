package relationship.filter;

import dao.MatriculateDao;
import relationship.MatriculateRelationship;

import java.util.List;
import java.util.stream.Collectors;

public class MatriculateFilter {

    public List<MatriculateRelationship> subjectMatriculateFrom(Long student) {
        MatriculateDao matriculateDao = new MatriculateDao();
        List<MatriculateRelationship> list = matriculateDao.all();

        return list.stream().filter(o -> student.equals(o.getStudent())).collect(Collectors.toList());
    }

    public List<MatriculateRelationship> studentMatriculateFrom(Long subject) {
        MatriculateDao matriculateDao = new MatriculateDao();
        List<MatriculateRelationship> list = matriculateDao.all();

        return list.stream().filter(o -> subject.equals(o.getSubject())).collect(Collectors.toList());
    }
}
