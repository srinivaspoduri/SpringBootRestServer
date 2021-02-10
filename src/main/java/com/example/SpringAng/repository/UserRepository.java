package com.example.SpringAng.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.SpringAng.model.User;



public interface UserRepository  extends MongoRepository<User,Integer>{

}
