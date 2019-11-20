package com.muraslab.post.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table
@Data
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "native")
    Long id;

    @Column(nullable = false)
    String firstName;

    @Column(nullable = false)
    String lastName;

    Long roleId;
}
