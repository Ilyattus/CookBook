package com.tutorial.tutorial.Entities;


import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "RECIPES")
public class Recipe {
    @Id
    @GeneratedValue
    private long id;
    private String title;
    private String ingr;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private String description;

    public String getIngr() {
        return ingr;
    }
    public void setIngr(String ingr) {
        this.ingr = ingr;
    }

    @ManyToOne
    @JoinColumn(name = "PERSON_ID")
    @JsonManagedReference
    private Person person; //author

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    @OneToMany(mappedBy = "recipe")
    @JsonManagedReference
    private List<Comment> comments;

//    @ManyToMany
//    @JoinTable(name = "RECIPE_INGREDIENTS",
//            joinColumns = @JoinColumn(name = "recipe_id"),
//            inverseJoinColumns = @JoinColumn(name = "ingredient_id")
//    )
//    @JsonManagedReference
//    private Set<Ingredient> ingr;

    public Recipe(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Person getAuthor() {
        return person;
    }

    public void setAuthor(Person person) {
        this.person = person;
    }

//    public Set<Ingredient> getIngr() {
//        return ingr;
//    }
//
//    public void setIngr(Set<Ingredient> ingr) {
//        this.ingr = ingr;
//    }
}
