package com.uacity.admin.domain;

import javax.persistence.*;

/**
 * Created by Ted on 16/4/23.
 */
@Entity
public class User {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "age", nullable = false)
    private Integer age;


    public Long getId() {
        return id;
    }


    public void setId( Long id ) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName( String name ) {
        this.name = name;
    }


    public Integer getAge() {
        return age;
    }


    public void setAge( Integer age ) {
        this.age = age;
    }
}
