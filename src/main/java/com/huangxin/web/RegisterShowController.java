package com.huangxin.web;

import com.huangxin.po.User;
import com.huangxin.service.UserService;
import com.huangxin.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

/**
 * @author huangxin
 * @date 2021/1/4-16:19
 */
@Controller
public class RegisterShowController {

    @Autowired
    private UserService userService;

    @GetMapping("/register")
    public String loginPage(){
        return "/register";
    }

    @PostMapping("/registerin")
    public String registerin(@RequestParam String username,
                        @RequestParam String nickname,
                        @RequestParam String password,
                        @RequestParam String email){
        Date date=new Date();

        User user=new User();
        user.setUsername(username);
        user.setNickname(nickname);
        user.setPassword(MD5Utils.code(password));
        user.setEmail(email);
        user.setType(2);
        user.setCreateTime(date);
        user.setUpdateTime(date);
        user.setAvatar("https://picsum.photos/id/1012/100/100");
        userService.addUser(user);
        return "/login";
    }
}
