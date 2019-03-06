package ru.inbox.foreman.springjsp.service;

import org.apache.tomcat.jni.User;

public interface UserService {
    User getUser(String login);
}
