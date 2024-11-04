package org.telran.shop.de.repository;

import org.telran.shop.de.model.User;

import java.util.List;

public interface UserRepository {
    List<User> getAll();

    User create(User user);

    User getByLogin(String login);

    List<User> filterhByFirstName(String firstName);

    List<User> filterByAge(int age);

    void deleteByLogin(String login);
}
