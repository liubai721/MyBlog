package com.wzf.service;

import com.wzf.po.User;

/**
 * Created by limi on 2020/10/15.
 */
public interface UserService {

    User checkUser(String username, String password);
}
