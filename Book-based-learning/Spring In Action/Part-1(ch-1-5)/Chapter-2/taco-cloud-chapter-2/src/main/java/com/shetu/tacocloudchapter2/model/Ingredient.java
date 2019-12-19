package com.shetu.tacocloudchapter2.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Ingredient {
    //fields: final type
    private final String id;
    private final String name;
    private final Type type;

    //create enum: similar like class
 public static enum Type {
     WRAP, PROTEIN, VEGGIES, CHEESE,SAUCE
    }
}
