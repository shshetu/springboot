package com.shetu.tacocloud.controller;

import com.shetu.tacocloud.model.Ingredient;
import com.shetu.tacocloud.model.Taco;
import jdk.internal.org.objectweb.asm.TypeReference;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Slf4j
@Controller
@RequestMapping("/design")
public class DesignTacoController {

    @GetMapping
    public String showDesignForm(Model model) {
        List<Ingredient> ingredientList = Arrays.asList(
                new Ingredient("FLTO", "Flour Tortilla",Ingredient.Type.Wrap),
                new Ingredient("COTO", "Corn Tortilla",Ingredient.Type.Wrap),
                new Ingredient("GRBF", "Ground Beef", Ingredient.Type.Protein),
                new Ingredient("FLTO", "Chiken", Ingredient.Type.Protein),
                new Ingredient("FLTO", "Flour Tortilla", Ingredient.Type.Cheese)
                );

        //create Type
        Ingredient.Type[] types = Ingredient.Type.values();
        for (Ingredient.Type type : types) {
//            model.addAttribute(type.toString().toLowerCase(), filterByType(ingredientList,type));
        }
        model.addAttribute("design",new Taco());
        return "design";
    }

    ///Tag: filterByType[]



}