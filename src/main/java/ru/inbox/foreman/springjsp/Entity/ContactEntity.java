package ru.inbox.foreman.springjsp.Entity;


import javax.persistence.*;

@Entity
@Table(name= "Contact")
public class ContactEntity {

    @Id
    @GeneratedValue
    @Column(name="contactId", nullable = false)
    private Long id;

    @Column(name="name", length = 255)
    private String name;

    @Column(name="lastName", length = 255)
    private String lastName;

    @Column(name="email", length = 255)
    private String email;

    @Column(name="phone", length = 255)
    private String phone;



}
