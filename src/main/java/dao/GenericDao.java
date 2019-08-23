package dao;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import java.io.Serializable;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
public abstract class GenericDao<T, I extends Serializable> {

    private Session currentSession;

    private Class<T> persistedClass;

    private Transaction currentTransaction;

    protected GenericDao(Class<T> persistedClass) {
        this();
        this.persistedClass = persistedClass;
    }

    public Session openCurrentSession() {
        currentSession = getSessionFactory().openSession();
        return currentSession;
    }

    public Session openCurrentSessionwithTransaction() {
        currentSession = getSessionFactory().openSession();
        currentTransaction = currentSession.beginTransaction();
        return currentSession;
    }

    public void closeCurrentSession() {
        currentSession.close();
    }

    public void closeCurrentSessionwithTransaction() {
        currentTransaction.commit();
        currentSession.close();
    }

    private static SessionFactory getSessionFactory() {
        Configuration configuration = new Configuration().configure();
        StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
                .applySettings(configuration.getProperties());
        return configuration.buildSessionFactory(builder.build());
    }


    public T save(@NonNull T entity) {
        openCurrentSessionwithTransaction();
        getCurrentSession().save(entity);
        closeCurrentSessionwithTransaction();
        return entity;
    }

    public T update(@NonNull T entity) {
        openCurrentSessionwithTransaction();
        getCurrentSession().update(entity);
        closeCurrentSessionwithTransaction();
        return entity;
    }

    public void delete(@NonNull I id) {
        openCurrentSessionwithTransaction();
        T entity = find(id);
        getCurrentSession().delete(entity);
        closeCurrentSessionwithTransaction();

    }

    public List all() {
        openCurrentSessionwithTransaction();
        Criteria criteria = getCurrentSession().createCriteria(persistedClass);
        List list = criteria.list();
        closeCurrentSessionwithTransaction();
        return list;
    }

    public T find(@NonNull I id) {
        openCurrentSessionwithTransaction();
        T obj = (T) getCurrentSession().get(persistedClass, id);
        closeCurrentSessionwithTransaction();
        return obj;
    }
}