package com.grupowl.springbootproject.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.grupowl.springbootproject.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}