package com.wzf.service;

import com.wzf.po.User;

/**
 * Created by Gene on 2020/10/15.
 */
public interface UserService {

    User checkUser(String username, String password);
    User register(String username, String password) throws Exception;
}
