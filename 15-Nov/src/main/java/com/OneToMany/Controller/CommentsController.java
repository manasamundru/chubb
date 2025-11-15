package com.OneToMany.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.OneToMany.Service.CommentsService;
import com.OneToMany.request.Comments;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@RestController
public class CommentsController {
	@Autowired
	CommentsService commentsService;
	@GetMapping("/comments")
	String getTutorial() {
		return "Tutorial";
	}
	@PostMapping("/comments")
	void saveTutorial(@RequestBody  Comments comment) {
		commentsService.insertComments(comment);
		
	}
	
 
}
