package com.huangxin.service;

import com.huangxin.po.Comment;

import java.util.List;

/**
 * @author huangxin
 * @date 2020/12/26-17:24
 */
public interface CommentService {

    //根据blogId获取评论
    List<Comment> listCommentByBlogId(Long blogId);
    //保存评论
    Comment saveComment(Comment comment);
}
