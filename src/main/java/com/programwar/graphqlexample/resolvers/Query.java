package com.programwar.graphqlexample.resolvers;

import java.util.Optional;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.programwar.graphqlexample.entities.Pet;
import com.programwar.graphqlexample.repositories.PetRepository;

import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class Query implements GraphQLQueryResolver {

    private final PetRepository petRepository;

    public Iterable<Pet> getAllPets() {
        return petRepository.findAll();
    }

    public Optional<Pet> getPet(Long id) {
        return this.petRepository.findById(id);
    }
}