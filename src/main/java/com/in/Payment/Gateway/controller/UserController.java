package com.in.Payment.Gateway.controller;

import com.in.Payment.Gateway.model.UserDO;
import com.in.Payment.Gateway.service.UserService;

public class UserController {
    private UserService userService;

    public UserController() {
        this.userService = new UserService();
    }

    public void addUser(UserDO user) {
        userService.addUser(user);
    }

    public UserDO getUser(int id) {
        return userService.getUser(id);
    }
}
