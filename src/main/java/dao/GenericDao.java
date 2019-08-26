package dao;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
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

    private Session session;

    private Class<T> persistedClass;

    private Transaction transaction;

    protected GenericDao(Class<T> persistedClass) {
        this();
        this.persistedClass = persistedClass;
    }


    public Session openSession() {
        session = getSessionFactory().openSession();
        transaction = session.beginTransaction();
        return session;
    }


    public void closeSession() {
        transaction.commit();
        session.close();
    }

    private static SessionFactory getSessionFactory() {
        Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
        StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
                .applySettings(configuration.getProperties());
        return configuration.buildSessionFactory(builder.build());
    }


    public I save(@NonNull T entity) {
        openSession();
        I pk = (I) getSession().save(entity);
        closeSession();
        return pk;
    }

    public T update(@NonNull T entity) {
        openSession();
        getSession().saveOrUpdate(entity);
        closeSession();
        return entity;
    }

    public void delete(@NonNull I id) {
        openSession();
        T entity = find(id);
        getSession().delete(entity);
        closeSession();

    }

    public List all() {
        openSession();
        List list = getSession().createQuery("from " + persistedClass.getName(),
                persistedClass).getResultList();
        closeSession();
        return list;
    }

    public T find(@NonNull I id) {
        openSession();
        T obj = getSession().get(persistedClass, id);
        closeSession();
        return obj;
    }
}