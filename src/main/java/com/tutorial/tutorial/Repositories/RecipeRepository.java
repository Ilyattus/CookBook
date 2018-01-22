package com.tutorial.tutorial.Repositories;

import com.tutorial.tutorial.Entities.Recipe;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeRepository extends CrudRepository<Recipe, Long>{
}
