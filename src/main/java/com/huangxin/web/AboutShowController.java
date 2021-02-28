package com.huangxin.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author huangxin
 * @date 2020/12/29-16:06
 */
@Controller
public class AboutShowController {


    @GetMapping("/about")
    public String about(){
        return "about";
    }
}
