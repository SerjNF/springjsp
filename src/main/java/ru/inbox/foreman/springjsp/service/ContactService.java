package ru.inbox.foreman.springjsp.service;

import ru.inbox.foreman.springjsp.entity.ContactEntity;
import ru.inbox.foreman.springjsp.model.Contact;

import java.util.List;

public interface ContactService {

    List listContactInfo();

    void addContact(ContactEntity contactEntity);

    void removeContact(Integer contactId);

    Contact contactInfo(Integer contactId);
}
