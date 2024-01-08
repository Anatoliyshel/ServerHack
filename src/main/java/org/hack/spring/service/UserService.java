package org.hack.spring.service;

import org.hack.spring.domain.User;

import java.util.List;

public interface UserService {
    User add(User user);

    List<User> getAll();

    User getById(long id);

    User update(User user);

    void deleteById(long id);

    void deleteAll();

}