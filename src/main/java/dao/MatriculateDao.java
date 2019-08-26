package dao;

import relationship.MatriculateRelationship;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class MatriculateDao extends GenericDao<MatriculateRelationship, Long> {

    public MatriculateDao() {
        super(MatriculateRelationship.class);
    }

    @Override
    public Long save(MatriculateRelationship entity) {
        if (contains(entity.getStudent(), entity.getSubject()))
            return -1L;
        openSession();
        Long pk = (Long) getSession().save(entity);
        closeSession();
        return pk;
    }

    private Boolean contains(Long student, Long subject) {
        List<MatriculateRelationship> list = all();
        AtomicReference<Boolean> exist = new AtomicReference<>(false);
        list.stream().forEach(o -> {
            if (student.equals(o.getStudent()) && subject.equals(o.getSubject()))
                exist.set(true);
        });
        return exist.get();
    }
}
