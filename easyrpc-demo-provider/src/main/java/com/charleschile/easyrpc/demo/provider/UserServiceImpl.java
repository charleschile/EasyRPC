package com.charleschile.easyrpc.demo.provider;

import com.charleschile.easyrpc.demo.api.User;
import com.charleschile.easyrpc.demo.api.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public User finById(Integer uid) {
        return new User(uid, "easyrpc" + System.currentTimeMillis());
    }
}
