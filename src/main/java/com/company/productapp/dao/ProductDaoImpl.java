package com.company.productapp.dao;

import com.company.productapp.dto.Product;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ProductDaoImpl implements ProductDao{

    private Map<Integer,Product> productMap = new HashMap<>();

    @Override
    public Product addProduct(Product product) {
        this.productMap.put(product.getId(),product);
        return this.productMap.get(product.getId());
    }

    @Override
    public Product getProductById(Integer productId) {
        return this.productMap.get(productId);
    }

    @Override
    public Product updateProduct(Product product) {
        return null;
    }

    @Override
    public Product deleteProduct(Integer productId) {
        return null;
    }

    @Override
    public Collection<Product> getAllProduct() {
        return null;
    }
}
