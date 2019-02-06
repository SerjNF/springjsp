package ru.inbox.foreman.springjsp.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.inbox.foreman.springjsp.Entity.ContactEntity;
import ru.inbox.foreman.springjsp.Model.Contact;

import java.util.List;


@Repository
@Transactional
public class ContactDAO {
    @Autowired
    private SessionFactory sessionFactory;

    public ContactDAO() {
    }

    public List<Contact> listContactInfo() {

        String sql = "Select new " + Contact.class.getName()
                + "(e.contactId, e.name, e.lastName, e.email, e.phone) "
                + " from " + ContactEntity.class.getName() + " e ";
        Session session = this.sessionFactory.getCurrentSession();
        Query<Contact> query = session.createQuery(sql, Contact.class);
        return query.getResultList();
    }

}
