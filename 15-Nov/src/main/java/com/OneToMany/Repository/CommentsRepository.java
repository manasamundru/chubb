package com.OneToMany.Repository;

import org.springframework.data.repository.CrudRepository;

import com.OneToMany.request.Comments;

public interface CommentsRepository extends CrudRepository<Comments,Integer>{

}
