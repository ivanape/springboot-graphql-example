package com.programwar.graphqlexample.repositories;

import com.programwar.graphqlexample.entities.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}