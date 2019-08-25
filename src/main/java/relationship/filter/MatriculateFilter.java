package relationship.filter;

import dao.MatriculateDao;
import relationship.MatriculateRelationship;

import java.util.List;
import java.util.stream.Collectors;

public class MatriculateFilter {

    public List subjectMatriculateFrom(Long student) {
        MatriculateDao matriculateDao = new MatriculateDao();
        List<MatriculateRelationship> list = matriculateDao.all();

        return list.stream().filter(o -> student.equals(o.getStudent())).collect(Collectors.toList());
    }
}
