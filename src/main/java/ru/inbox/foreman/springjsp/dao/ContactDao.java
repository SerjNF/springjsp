package ru.inbox.foreman.springjsp.dao;


import ru.inbox.foreman.springjsp.entity.ContactEntity;
import ru.inbox.foreman.springjsp.model.Contact;

import java.util.List;

public interface ContactDao {
    List listContactInfo();

    void addContact(ContactEntity contactEntity);

    void removeContact(Integer contactId);

    Contact findContactById(Integer contactId);
}