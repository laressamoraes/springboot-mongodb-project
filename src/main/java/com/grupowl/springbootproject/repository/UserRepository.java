package com.grupowl.springbootproject.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.grupowl.springbootproject.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}