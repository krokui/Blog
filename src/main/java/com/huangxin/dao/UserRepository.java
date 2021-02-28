package com.huangxin.dao;

import com.huangxin.po.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

/**
 * @author huangxin
 * @date 2020/12/11-17:19
 */
public interface UserRepository extends JpaRepository<User,Long> {

    //通过用户名和密码查找用户
    User findByUsernameAndPassword(String username,String password);

}
