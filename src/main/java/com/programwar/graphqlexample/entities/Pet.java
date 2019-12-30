package com.programwar.graphqlexample.entities;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

import com.programwar.graphqlexample.enums.Animal;

@Data
@Entity
@Table(name="pets")
public class Pet {

    public Pet() {

    }

    public Pet(String name, Animal type, int age) {
        this.setName(name);
        this.setType(type);
        this.setAge(age);
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private Animal type;

    private int age;
}