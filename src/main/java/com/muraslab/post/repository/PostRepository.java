package com.muraslab.post.repository;


import com.muraslab.post.model.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
