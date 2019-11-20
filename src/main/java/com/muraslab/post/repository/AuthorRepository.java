package com.muraslab.post.repository;

import com.muraslab.post.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long> {
}
