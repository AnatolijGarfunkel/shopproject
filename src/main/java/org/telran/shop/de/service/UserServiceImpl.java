package org.telran.shop.de.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.telran.shop.de.model.User;
import org.telran.shop.de.repository.UserRepository;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public List<User> getAll() {
        return userRepository.getAll();
    }

    @Override
    public User create(User user) {
        return userRepository.create(user);
    }

    @Override
    public User getByLogin(String login) {
        return userRepository.getByLogin(login);
    }

    @Override
    public List<User> filterByFirstName(String firstName) {
        return userRepository.filterhByFirstName(firstName);
    }

    @Override
    public List<User> filterByAge(int age) {
        return userRepository.filterByAge(age);
    }

    @Override
    public void deleteByLogin(String login) {
        userRepository.deleteByLogin(login);
    }
}
