package com.shetu.tacocloud.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Ingredient {
    //variables: id, name , type, enum
    private final String id;
    private final String name;
    private final Type type;

    //static Enum
    public static enum Type{
    Wrap, Protein, Vaggies, Cheese, Sauce
    }
}
