package ru.inbox.foreman.springjsp.Entity;


import javax.persistence.*;

@Entity
@Table(name = "Contact")
public class ContactEntity {

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

    @Id
    @GeneratedValue
    @Column(name = "contactId", nullable = false)
    private int contactId;

    @Column(name = "name", length = 255)
    private String name;

    @Column(name = "lastName", length = 255)
    private String lastName;

    @Column(name = "email", length = 255)
    private String email;

    @Column(name = "phone", length = 255)
    private String phone;


}
