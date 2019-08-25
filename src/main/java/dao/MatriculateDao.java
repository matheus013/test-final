package dao;

import relationship.MatriculateRelationship;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class MatriculateDao extends GenericDao<MatriculateRelationship, Long> {

    public MatriculateDao() {
        super(MatriculateRelationship.class);
    }

    @Override
    public MatriculateRelationship save(MatriculateRelationship entity) {
        if (contains(entity.getStudent(), entity.getSubject()))
            return entity;
        openCurrentSessionwithTransaction();
        getCurrentSession().save(entity);
        closeCurrentSessionwithTransaction();
        return entity;
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
