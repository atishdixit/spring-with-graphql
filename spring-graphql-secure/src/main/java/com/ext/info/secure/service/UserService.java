package com.ext.info.secure.service;

import com.ext.info.secure.model.User;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private List<User> users = new ArrayList<>();

    public List<User> findAll() {
        return users;
    }

    public Optional<User> findOne(Integer id) {
        return users.stream().filter(user -> user.userId() == id).findFirst();
    }

    public void create(int id, String username) {
        users.add(new User(id,username));
    }

    @PostConstruct
    private void init() {
        create(1,"user");
        create(2,"admin");
    }

}