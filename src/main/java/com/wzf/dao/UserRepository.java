package com.wzf.dao;

import com.wzf.po.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Gene on 2020/10/15.
 */
public interface UserRepository extends JpaRepository<User,Long> {


    User findByUsername(String username);

    // select * from t_user where username= and password
    User findByUsernameAndPassword(String username, String password);
}
