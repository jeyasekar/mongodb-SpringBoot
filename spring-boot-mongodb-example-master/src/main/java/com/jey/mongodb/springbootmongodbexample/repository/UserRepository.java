package com.jey.mongodb.springbootmongodbexample.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.jey.mongodb.springbootmongodbexample.document.Users;

public interface UserRepository extends MongoRepository<Users, Integer> {
}
