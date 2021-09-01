package com.service;

import com.model.User;

public interface UserService {
    String selectUser(User user);
    void regist(User user);
}
