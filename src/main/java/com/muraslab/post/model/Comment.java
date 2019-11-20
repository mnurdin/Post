package com.muraslab.post.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table
@Data
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY,generator = "native")
    Long id;

    @Column
    String comment;
}
