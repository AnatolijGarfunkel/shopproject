package org.telran.shop.de.service;

import org.telran.shop.de.model.User;

import java.util.List;

public interface UserService {

    public List<User> getAll ();

    User create(User user);

    User getByLogin(String login);

    List<User> filterByFirstName(String firstName);

    List<User> filterByAge(int age);

    void deleteByLogin(String login);
}
