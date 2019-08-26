package dao;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

@Setter
@Getter
public class GenericDaoSpring<T, PK extends Serializable> implements InterfaceGenericDao<T, PK> {

    private Class<T> type;

    @Autowired
    private SessionFactory sessionFactory;

    public GenericDaoSpring(Class<T> type) {
        this.type = type;
    }

    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    @Transactional(rollbackFor = RuntimeException.class)
    public PK save(T o) {
        PK id = (PK) getSession().save(o);
        return id;
    }

    @Transactional(rollbackFor = RuntimeException.class)
    public void update(T o) {
        getSession().update(o);
    }

    @Transactional(readOnly = true)
    public T find(PK id) {
        return getSession().get(type, id);
    }

    @Transactional(readOnly = true)
    public List<T> all() {
        return getSession().createQuery("from " + type.getName(), type).getResultList();
    }

    @Transactional(rollbackFor = RuntimeException.class)
    public void delete(PK id) {
        T o = getSession().load(type, id);
        getSession().delete(o);
    }

    @Transactional(rollbackFor = RuntimeException.class)
    public void delete(T o) {
        getSession().delete(o);
    }
}