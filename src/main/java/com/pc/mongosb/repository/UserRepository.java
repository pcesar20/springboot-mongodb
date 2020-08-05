package com.pc.mongosb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.pc.mongosb.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
