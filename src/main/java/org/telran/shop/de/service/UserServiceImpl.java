package org.telran.shop.de.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.telran.shop.de.entity.User;
import org.telran.shop.de.repository.UserRepository;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;


// GET -----------------------------------------------------------------------------------------------------------------

    @Override
    public List<User> getAll() {
        return repository.findAll();
    }

    @Override
    public User getById(long id) {
        return repository.findById(id).get();
    }

    @Override
    public User getByLogin(String login) {
        return repository.getUserByLogin(login);
    }

    @Override
    public List<User> getByFullAdress(String fullAddress) {
        return List.of();
    }

// POST ----------------------------------------------------------------------------------------------------------------

    @Override
    public User create(User user) {
        return null;
    }

    @Override
    public User update(long id, User user) {
        return null;
    }

    @Override
    public User updateAdress(long id, User user) {
        return null;
    }

// DELETE --------------------------------------------------------------------------------------------------------------

    @Override
    public User delete(long id) {
        return null;
    }

    @Override
    public List<User> getWithEqualsPassword(String password) {
        return List.of();
    }
}
