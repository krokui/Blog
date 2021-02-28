package com.huangxin.service;

import com.huangxin.dao.UserRepository;
import com.huangxin.po.User;
import com.huangxin.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author huangxin
 * @date 2020/12/11-17:18
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User checkUser(String username, String password) {
        User user = userRepository.findByUsernameAndPassword(username, MD5Utils.code(password));
        return user;
    }

    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }
}
