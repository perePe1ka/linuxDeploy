package ru.vladuss.adminka_linux.models;


import java.time.LocalDateTime;

public class User extends BaseEntity{

    private String email;

    public User() {

    }

    public User(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
