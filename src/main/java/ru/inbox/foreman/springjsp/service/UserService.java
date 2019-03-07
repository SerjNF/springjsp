package ru.inbox.foreman.springjsp.service;

import ru.inbox.foreman.springjsp.model.User;

public interface UserService {
    User getUser(String login);
}
