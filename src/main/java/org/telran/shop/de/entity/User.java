package org.telran.shop.de.model;

public class User {

    private String login;

    private String password;

    private String email;

    private UserData data;

    public User(String login, String password, String email, UserData data) {
        this.login = login;
        this.password = password;
        this.email = email;
        this.data = data;
    }

    public User() {
        //
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UserData getData() {
        return data;
    }

    public void setData(UserData data) {
        this.data = data;
    }
}
