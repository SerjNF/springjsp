package ru.inbox.foreman.springjsp.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.inbox.foreman.springjsp.entity.ContactEntity;
import ru.inbox.foreman.springjsp.model.Contact;

import java.util.List;

@Repository
@Transactional
public class ContactDaoImpl implements ContactDao {
    @Autowired
    private SessionFactory sessionFactory;


    public ContactDaoImpl() {
    }

    @Override
    public List listContactInfo() {
        return this.sessionFactory.getCurrentSession().createQuery("from ContactEntity").getResultList();
    }

    @Override
    public void addContact(ContactEntity contactEntity) {
        this.sessionFactory.getCurrentSession().save(contactEntity);
    }

    @Override
    public void removeContact(Integer contactId) {
        ContactEntity contactEntity = sessionFactory.getCurrentSession().load(ContactEntity.class, contactId);
        if (null != contactEntity) {
            sessionFactory.getCurrentSession().delete(contactEntity);
        }
    }

    @Override
    public Contact findContactById(Integer contactId) {
        ContactEntity contactEntity = sessionFactory.getCurrentSession().load(ContactEntity.class, contactId);
        Contact contact = new Contact (contactEntity);
        return contact;
    }
}
