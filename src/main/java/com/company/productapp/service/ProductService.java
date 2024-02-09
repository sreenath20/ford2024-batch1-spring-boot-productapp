package com.company.productapp.service;

import com.company.productapp.dto.Product;
import com.company.productapp.exceptions.ProductException;

import java.util.List;

public interface ProductService { // contract

    Product createNewProduct(Product newProduct) throws ProductException;
    Product getProductById(Integer productId)throws ProductException;
    Product updateProduct(Product product)throws ProductException;
    Product deleteProductById(Integer productId)throws ProductException;
    List<Product> getAllProducts()throws ProductException;
    List<Product> getAllProductsSortedByPrice()throws ProductException;

}
