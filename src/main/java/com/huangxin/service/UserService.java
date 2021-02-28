package com.huangxin.service;

import com.huangxin.po.User;

/**
 * @author huangxin
 * @date 2020/12/11-17:17
 */

public interface UserService {

    //检查账户密码
    User checkUser(String username,String password);
    //添加用户
    User addUser(User user);
}
