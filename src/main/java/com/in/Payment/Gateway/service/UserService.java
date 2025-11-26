package com.in.Payment.Gateway.service;

import com.in.Payment.Gateway.model.UserDO;

import java.util.*;

public class UserService {
    private static Map<Integer, UserDO> users = new HashMap<>();

    public UserService() {
        // Constructor
    }

    public void addUser(UserDO user) {
        users.put(user.getId(), user);
        System.out.println("User added: " + user.getFirstName());
    }

    public UserDO getUser(int id) {
        return users.get(id);
    }
}
