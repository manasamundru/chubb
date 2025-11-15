package com.OneToMany.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OneToMany.Repository.CommentsRepository;
import com.OneToMany.request.Comments;

@Service
public class CommentsService {
  @Autowired
  CommentsRepository commentsRepo;
  public Comments insertComments(Comments comment) {
	  commentsRepo.save(comment);
	   return comment;
  }
  
}
