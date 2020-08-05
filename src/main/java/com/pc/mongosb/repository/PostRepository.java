package com.pc.mongosb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.pc.mongosb.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{

}
