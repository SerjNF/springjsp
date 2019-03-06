package ru.inbox.foreman.springjsp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.inbox.foreman.springjsp.dao.ContactDao;
import ru.inbox.foreman.springjsp.entity.ContactEntity;
import ru.inbox.foreman.springjsp.model.Contact;

import java.util.List;

@Service
public class ContactServiceImpl implements ContactService {
    @Autowired
    private ContactDao contactDao;

    @Override
    public List listContactInfo() {
        return contactDao.listContactInfo();
    }

    @Override
    public void addContact(ContactEntity contactEntity) {
        contactDao.addContact(contactEntity);
    }

    @Override
    public void removeContact(Integer contactId) {
        contactDao.removeContact(contactId);
    }

    @Override
    public Contact contactInfo(Integer contactId) {
        return contactDao.findContactById(contactId);
    }
}
