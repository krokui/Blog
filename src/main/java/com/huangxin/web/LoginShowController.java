package com.huangxin.web;

import com.huangxin.po.User;
import com.huangxin.service.BlogService;
import com.huangxin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;

/**
 * @author huangxin
 * @date 2021/1/3-11:27
 */

@Controller
public class LoginShowController {

    @Controller
    public class LoginController {

        @Autowired
        private UserService userService;

        @Autowired
        private BlogService blogService;


        @GetMapping("/login")
        public String loginPage(){
            return "/login";
        }


        @PostMapping("/loginin")
        public String login(@RequestParam String username,
                            @RequestParam String password,
                            HttpSession session,
                            RedirectAttributes attributes){
            User user=userService.checkUser(username,password);
            if (user !=null&& user.getType()!=1){
                user.setPassword(null);
                session.setAttribute("user",user);
                return "/success";
            }else if (user !=null&& user.getType()==1){
                attributes.addFlashAttribute("message",
                                             "该账号为管理员账户，请使用管理员登陆");
                return "redirect:/login";
            }else {
                attributes.addFlashAttribute("message",
                                             "用户名或密码错误");
                return "redirect:/login";
            }
        }

        @GetMapping("/logout")
        public String logout(HttpSession session){
            session.removeAttribute("user");
            return "redirect:/login";
        }
    }
}
