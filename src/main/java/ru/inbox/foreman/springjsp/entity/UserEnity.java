package ru.inbox.foreman.springjsp.entity;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class UserEnity {

    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @Column(name = "userId")
    private int userId;

    @Column(name = "userLogin", length = 30)
    private String userLogin;

    @Column(name = "userPassword", length = 100)
    private String userPassword;

    @Column(name = "userRole", length = 30)
    private String userRole;


    public UserEnity(String userLogin, String userPassword, String userRole) {
        this.userLogin = userLogin;
        this.userPassword = userPassword;
        this.userRole = userRole;
    }

    public UserEnity() {

    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }
}
