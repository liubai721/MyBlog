package com.wzf.service;

import com.wzf.dao.UserRepository;
import com.wzf.po.User;
import com.wzf.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Gene on 2020/10/15.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired  //这个注解相当于 userRepository=new UserRepository();
     private UserRepository userRepository;

    @Override
    public User checkUser(String username, String password) {
        User user = userRepository.findByUsernameAndPassword(username, MD5Utils.code(password));
        return user;
    }

    @Override
    public User register(String username, String password) throws Exception {
        User user = userRepository.findByUsername(username);
        if (user != null) {
            throw new Exception("用户名已存在");
        }
        user = new User();
        user.setUsername(username);
        user.setPassword(MD5Utils.code(password));
        user = userRepository.save(user);
        return user;
    }
}
