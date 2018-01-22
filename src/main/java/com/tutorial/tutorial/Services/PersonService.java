package com.tutorial.tutorial.Services;

import com.tutorial.tutorial.Entities.Person;
import com.tutorial.tutorial.Repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class PersonService {
    @Autowired
    PersonRepository personRepository;

    public Person getPerson(long id){
        return personRepository.findOne(id);
    }

    public Iterable getPersons(){
        return personRepository.findAll();
    }

    public Iterable<Person> personSearch(String query){
        return personRepository.findByNameContaining(query);
    }

//    public Iterable<Person> getAllComments(long id){
//        return personRepository.findOne(id).getRecipes().stream()
//                .map(recipe -> recipe.getComments())
//                .flatMap(people -> people.stream())
//                .filter(person -> person.getId() != id)
//                .collect(Collectors.toSet());
//    }

}
