package com.wzf.dao;

import com.wzf.po.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by limi on 2020/10/15.
 */
public interface UserRepository extends JpaRepository<User,Long> {

    User findByUsernameAndPassword(String username, String password);
}
