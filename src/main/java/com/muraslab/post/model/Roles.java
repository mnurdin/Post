package com.muraslab.post.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
@Data
public class Roles {

    @Column
    private String user;

    @Column
    private String admin;

    @Column(name = "super_admin")
    private String superAdmin;
}
