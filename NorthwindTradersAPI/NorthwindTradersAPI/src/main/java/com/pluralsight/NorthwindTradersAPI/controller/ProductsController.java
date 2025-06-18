package com.pluralsight.NorthwindTradersAPI.controller;

import com.pluralsight.NorthwindTradersAPI.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductsController {

    @GetMapping(path ="/products")
    public List<Product> getProdcuts(){
        List<Product> products = new ArrayList<>();
        products.add(new Product(1,"Iced Latte",1,5.00));
        products.add(new Product(2,"Mocha Frappe",2,15.00));
        products.add(new Product(3,"Iced Latte",3,10.00));
        products.add(new Product(4,"Iced Latte",4,20.00));
        return products;
    }

    @GetMapping(path = "/products/{id}")
    public Product find(@PathVariable int id) {
        Product product = new Product(id,"Iced Coffee",1,5.00);
        return product;
    }
}
