package com.huangxin.web;

import com.huangxin.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author huangxin
 * @date 2020/12/29-15:31
 */
@Controller
public class ArhivesShowController {

    @Autowired
    private BlogService blogService;


    @GetMapping("/archives")
    public String archives(Model model){
        model.addAttribute("archiveMap",
                            blogService.archiveBlog());
        model.addAttribute("blogCount",
                            blogService.countBlog());
        return "archives";
    }
}
