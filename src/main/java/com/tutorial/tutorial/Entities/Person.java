package com.tutorial.tutorial.Entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "PERSONS")
public class Person {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
//    @Column(name = "FIRST_NAME")
//    private String firstname;
//
//    @Column(name = "SECOND_NAME")
//    private String secondname;
//    private Date birthday;



    @OneToMany(mappedBy = "person") // author
    @JsonManagedReference
    private List<Recipe> recipes;

    public Person(){}

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Recipe> getRecipes() {
        return recipes;
    }

    //    public String getSecondname() {
//        return secondname;
//    }
//
//    public void setSecondname(String secondname) {
//        this.secondname = secondname;
//    }
//
//    public Date getBirthday() {
//        return birthday;
//    }
//
//    public void setBirthday(Date birthday) {
//        this.birthday = birthday;
//    }
}
