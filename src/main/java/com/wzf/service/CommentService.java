package com.wzf.service;

import com.wzf.po.Comment;

import java.util.List;

/**
 * Created by Gene on 2020/10/22.
 */
public interface CommentService {

    List<Comment> listCommentByBlogId(Long blogId);

    Comment saveComment(Comment comment);
}
