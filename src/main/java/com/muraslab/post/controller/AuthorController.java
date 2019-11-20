package com.muraslab.post.controller;

import com.muraslab.post.model.Author;
import com.muraslab.post.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/authors")
public class AuthorController {

    @Autowired
    AuthorRepository authorRepository;

    @GetMapping
    public ResponseEntity<Iterable<Author>> index() {
        return ResponseEntity.ok().body(authorRepository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Author>> findOne(@PathVariable Long id) {
        return ResponseEntity.ok().body(authorRepository.findById(id));
    }

}
