package com.programwar.graphqlexample.inputs;

import com.programwar.graphqlexample.enums.Animal;

import lombok.Data;

@Data
public class CreatePetInput {

    private String name;
    private Animal type;
    private int age;
}