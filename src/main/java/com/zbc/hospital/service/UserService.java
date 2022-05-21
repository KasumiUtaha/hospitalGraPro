package com.zbc.hospital.service;

import com.zbc.hospital.pojo.User;

public interface UserService {

    boolean register(User user);
    boolean active(String code);
    User login(User user);
    boolean checkUserName(String user);
}
