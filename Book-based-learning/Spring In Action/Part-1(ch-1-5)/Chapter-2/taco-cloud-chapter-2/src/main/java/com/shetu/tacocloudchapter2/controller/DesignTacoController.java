package com.shetu.tacocloudchapter2.controller;

import com.shetu.tacocloudchapter2.model.Ingredient;
import com.shetu.tacocloudchapter2.model.Ingredient.Type;
import com.shetu.tacocloudchapter2.model.Taco;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Controller
@RequestMapping("/design")
public class DesignTacoController {
    ///Load the List to the before the Rest controller
    @ModelAttribute
    public void addIngredientsToModel(Model model) {
        List<Ingredient> ingredientList = Arrays.asList(
                new Ingredient("FLTO", "Flour Tortilla", Type.WRAP),
                new Ingredient("COTO", "Corn Tortilla", Type.WRAP),
                new Ingredient("GRBF", "Ground Beef", Type.PROTEIN),
                new Ingredient("CARN", "Carnitas", Type.PROTEIN),
                new Ingredient("TMTO", "Diced Tomatoes", Type.VEGGIES),
                new Ingredient("LETC", "Lettuce", Type.VEGGIES),
                new Ingredient("CHED", "Cheddar", Type.CHEESE),
                new Ingredient("JACK", "Monterrey Jack", Type.CHEESE),
                new Ingredient("SLSA", "Salsa", Type.SAUCE),
                new Ingredient("SRCR", "Sour Cream", Type.SAUCE)
        );
        Type[] types = Ingredient.Type.values();
        for (Type type : types) {
            model.addAttribute(type.toString().toLowerCase(), filterByType(ingredientList, type));
        }
    }

    //Show Design Form :getMapping
    private String showDesignForm(Model model){
        model.addAttribute("design",new Taco());
        return "design";
    }
    ///process Design : postMapping

    //Ingredient List
    private List<Ingredient> filterByType(
            List<Ingredient> ingredients, Ingredient.Type type
    ) {
        return ingredients.stream().filter(x -> x.getType().equals(type))
                .collect(Collectors.toList());
    }
}
