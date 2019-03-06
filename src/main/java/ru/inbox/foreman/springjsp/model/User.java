package ru.inbox.foreman.springjsp.model;


public class User {
    private int userId;

    private String userLogin;

    private String userPassword;

    private String userRole;


    public User(String userLogin, String userPassword, String userRole) {
        this.userLogin = userLogin;
        this.userPassword = userPassword;
        this.userRole = userRole;
    }

    public User() {
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

