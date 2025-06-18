package com.pluralsight.NorthwindTradersAPI.dao;

import com.pluralsight.NorthwindTradersAPI.model.Product;

import java.util.List;

public interface ProductDAO {

    List<Product> getAll();
    Product getById(int id);
}
