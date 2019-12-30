package com.programwar.graphqlexample.mutations;

import java.util.Optional;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.programwar.graphqlexample.entities.Pet;
import com.programwar.graphqlexample.inputs.CreatePetInput;
import com.programwar.graphqlexample.inputs.UpdatePetInput;
import com.programwar.graphqlexample.repositories.PetRepository;
import org.springframework.stereotype.Component;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class PetMutation implements GraphQLMutationResolver {

    private final PetRepository petRepository;

    public Pet createPet(CreatePetInput input) {
        return this.petRepository.save(new Pet(input.getName(), input.getType(), input.getAge()));
    }

    public Pet updatePet(UpdatePetInput input) {        
        Optional<Pet> pet = this.petRepository.findById(input.getId());

        if(pet.isPresent()) {
            
            pet.get().setAge(input.getAge());
            pet.get().setName(input.getName());
            pet.get().setType(input.getType());

            return this.petRepository.save(pet.get());
        }

        throw new IllegalArgumentException();
    }    
    
    public boolean deletePet(Long id) {
        this.petRepository.deleteById(id);

        return true;
    }
}