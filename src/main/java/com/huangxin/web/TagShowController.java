package com.huangxin.web;

import com.huangxin.po.Blog;

import com.huangxin.po.Tag;
import com.huangxin.service.BlogService;
import com.huangxin.service.TagService;
import com.huangxin.vo.BlogQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * @author huangxin
 * @date 2020/12/27-20:45
 */
@Controller
public class TagShowController {

    @Autowired
    private TagService tagService;

    @Autowired
    private BlogService blogService;

    @GetMapping("/tags/{id}")
    public String Tags(@PageableDefault(size = 8,sort = {"updateTime"},
                       direction = Sort.Direction.DESC) Pageable pageable,
                       @PathVariable Long id, BlogQuery blog, Model model){
        List<Tag> tags= tagService.listTagTop(10000);
        if (id == -1){
            id = tags.get(0).getId();
        }
        model.addAttribute("tags",tags);
        model.addAttribute("page",
                            blogService.listBlog(id,pageable));
        model.addAttribute("activeTagId",id);
        return "tags";
    }

}