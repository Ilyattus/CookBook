package com.tutorial.tutorial.Controllers;


import com.tutorial.tutorial.Entities.Person;
import com.tutorial.tutorial.Entities.Recipe;
import com.tutorial.tutorial.Repositories.PersonRepository;
import com.tutorial.tutorial.Repositories.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

    @Autowired
    RecipeRepository recipeRepository;

    @GetMapping("/test")
    public Iterable<Recipe> test(){
        return recipeRepository.findAll();
    }
}

//поиск подстроки в строке
//SELECT * FROM RECIPES
//        WHERE CHARINDEX('E', TITLE);