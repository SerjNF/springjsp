package ru.inbox.foreman.springjsp.model;


import ru.inbox.foreman.springjsp.entity.ContactEntity;

public class Contact {

    private int contactId;

    private String name;

    private String lastName;

    private String email;

    private String phone;

    public Contact(String name, String lastName, String email, String phone) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
    }

    public Contact(ContactEntity contactEntity){
        this.name = contactEntity.getName();
        this.lastName = contactEntity.getLastName();
        this.contactId = contactEntity.getContactId();
        this.email = contactEntity.getEmail();
        this.phone = contactEntity.getPhone();
    }

    public Contact() {
    }

    public int getContactId() {
        return contactId;
    }

    public void setContactId(int contactId) {
        this.contactId = contactId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
