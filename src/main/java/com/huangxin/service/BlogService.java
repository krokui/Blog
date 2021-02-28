package com.huangxin.service;

import com.huangxin.po.Blog;
import com.huangxin.vo.BlogQuery;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Map;

/**
 * @author huangxin
 * @date 2020/12/19-15:57
 */
public interface BlogService {

    //根据id获取博客
    Blog getBlog(Long id);
    //根据id获取博客然后转换
    Blog getAndConvert(Long id);
    //根据pageable和blog分页查询博客
    Page<Blog> listBlog(Pageable pageable, BlogQuery blog);
    //分页查询
    Page<Blog> listBlog(Pageable pageable);
    //根据tagId分页
    Page<Blog> listBlog(Long tagId,Pageable pageable);
    //根据查询语句分页
    Page<Blog> listBlog(String query,Pageable pageable);
    //按更新时间由新到旧排序，共size个blog
    List<Blog> listRecommendBlogTop(Integer size);
    //获得博客归档
    Map<String,List<Blog>> archiveBlog();
    //获得博客总数
    Long countBlog();
    //根据博客保存博客
    Blog saveBlog(Blog blog);
    //根据id和博客更新博客
    Blog updateBlog(Long id,Blog blog);
    //根据id删除博客
    void deleteBlog(Long id);
}
