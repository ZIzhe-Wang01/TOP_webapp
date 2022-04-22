package com.top.controller;


import com.top.dao.entity.Comment;
import com.top.service.CommentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/comment/")
public class CommentController {
	
	@Autowired
	private CommentService commentService;
	
	@RequestMapping("add")
	public String add(Comment comment){
		commentService.save(comment);
		return "redirect:/post/detail/"+comment.getPostId();
	}

}
