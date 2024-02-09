package com.company.productapp.dao;

import com.company.productapp.dto.Product;

import java.util.Collection;

public interface ProductDao {

    //CRUD
    Product addProduct(Product product);
    Product getProductById(Integer productId);
    Product updateProduct(Product product);
    Product deleteProduct(Integer productId);
    Collection<Product> getAllProduct();
}
