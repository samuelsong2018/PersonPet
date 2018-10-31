package me.samuel.demo;

import me.samuel.demo.Person;
import org.springframework.data.repository.CrudRepository;


public interface PersonRepository extends CrudRepository<Person,Long>{}