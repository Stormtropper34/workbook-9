package com.pluralsight.NorthwindTradersAPI.controller;

import com.pluralsight.NorthwindTradersAPI.model.Category;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


import java.util.ArrayList;
import java.util.List;

@RestController
public class CategoriesController {

    @GetMapping(path="/categories")
    public List<Category> getCategories() {
        List<Category> categories = new ArrayList<>();
        categories.add(new Category(4,"Jordan"));
        categories.add(new Category(5,"Nike"));
        categories.add(new Category(8,"Adidas"));
        return categories;
    }

    @GetMapping(path = "/categories/{id}")
    public Category find(@PathVariable int id){
        Category category = new Category(id,"Jordan");
        return category;
    }

}
