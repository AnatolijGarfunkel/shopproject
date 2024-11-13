package org.telran.shop.de.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.telran.shop.de.entity.User;
import org.telran.shop.de.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService service;


// GET -----------------------------------------------------------------------------------------------------------------

    @GetMapping
    public List<User> getAll () {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public User getById(@PathVariable long id) {
        return service.getById(id);
    }

    @GetMapping("/login")
    public User getByLogin (@RequestParam String login) {
        return service.getByLogin(login);
    }

    @GetMapping("/address")
    public List<User> getByFullAddress(@RequestParam String fullAddress) {
        return service.getByFullAdress(fullAddress);
    }

// POST ----------------------------------------------------------------------------------------------------------------

    @PostMapping
    public User create(@RequestBody User user) {
        return service.create(user);
    }

    @PutMapping("/{id}")
    public User update(@PathVariable long id, @RequestBody User user) {
        return service.update(id, user);
    }

    @PutMapping("/adress/{id}")
    public User updateAdress(@PathVariable long id, @RequestBody User user) {
        return service.updateAdress(id, user);
    }


    @PostMapping("/equals_password")
    public List<User> getWithEqualsPassword(@RequestBody String password) {
        return service.getWithEqualsPassword(password);
    };

// DELETE --------------------------------------------------------------------------------------------------------------

    @DeleteMapping("/{id}")
    public User delete(@PathVariable long id) {
        return service.delete(id);
    }
}









































