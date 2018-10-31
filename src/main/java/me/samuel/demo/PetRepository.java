package me.samuel.demo;

import me.samuel.demo.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet,Long>{}