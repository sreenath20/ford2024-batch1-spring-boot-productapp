package com.company.productapp.controller;

import com.company.productapp.dao.ProductDao;
import com.company.productapp.dto.Product;
import com.company.productapp.exceptions.ProductException;
import com.company.productapp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    // create all RestFull api

    @PostMapping("product")
    public Product createNewProduct(@RequestBody Product newProduct){

        Product product=null;
        try {
            product = this.productService.createNewProduct(newProduct);
        } catch (ProductException e) {
            e.printStackTrace();
        }
        return product;
    }

    @GetMapping("product/{id}")
    public Product getProductBuId(@PathVariable Integer id)  {
        Product product=null;
        try {
            product = this.productService.getProductById(id);
        } catch (ProductException e) {
            e.printStackTrace();
        }
        return product;
    }


}
