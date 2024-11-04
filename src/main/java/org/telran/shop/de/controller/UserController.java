package org.telran.shop.de.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.telran.shop.de.model.User;
import org.telran.shop.de.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping
    public List<User> getAll () {
        return userService.getAll();
    }

    @PostMapping
    public User create (@RequestBody User user) {
        return userService.create(user);
    }

    @GetMapping("/{login}")
    public User getByLogin (@PathVariable String login) {
        return userService.getByLogin(login);
    }

    @GetMapping("/filterByFirstName")
    public List<User> filterByFirstName (@RequestParam(name = "firstName") String firstName) {
        return userService.filterByFirstName(firstName);
    }

    @GetMapping("/filterByAge")
    public List<User> filterByAge (@RequestParam(name = "age") int age) {
        return userService.filterByAge(age);
    }

    @DeleteMapping("/{login}")
    public void delteByLogin (@PathVariable String login) {
        userService.deleteByLogin(login);
    }
}









































