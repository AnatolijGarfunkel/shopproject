package org.telran.shop.de.repository;

import org.springframework.stereotype.Component;
import org.telran.shop.de.model.User;
import org.telran.shop.de.model.UserData;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class UserInMemoryRepositoryImpl implements UserRepository {

    private Map<String, User> usersMap = new HashMap<>();

    public UserInMemoryRepositoryImpl() {
        init ();
    }

    private void init() {
        List<User> userList = List.of(
                new User("alex.senin", "alexs", "alexs@telran.de", new UserData("Alex", "Senin", 23)),
                new User("peter.forsberg", "peterf", "peterf@telran.de", new UserData("Peter", "Forsberg", 27)),
                new User("alex.ovechkin", "alexo", "alexo@telran.de", new UserData("Alex", "Ovechkin", 37)),
                new User("florian.wirtz", "florianw", "florianw@telran.de", new UserData("Florian", "Wirtz", 24)),
                new User("thomas.mueller", "thomasm", "thomasm@telran.de", new UserData("Thomas", "Mueller", 33))
        );

        for (User data : userList) {
            usersMap.put(data.getLogin(), data);
        }
    }

    @Override
    public List<User> getAll() {
        return usersMap.values().stream().toList();
    }

    @Override
    public User create(User user) {
        usersMap.put(user.getLogin(), user);
        return user;
    }

    @Override
    public User getByLogin(String login) {
        return usersMap.get(login);
    }

    @Override
    public List<User> filterhByFirstName(String firstName) {
        return usersMap.values()
                .stream()
                .filter(user -> user.getData().getFirstName().equals(firstName))
                .toList();
    }

    @Override
    public List<User> filterByAge(int age) {
        return usersMap.values()
                .stream()
                .filter(user -> user.getData().getAge() <= age)
                .toList();
    }

    @Override
    public void deleteByLogin(String login) {
        usersMap.remove(login);
    }
}









































