package com.company.productapp.service;

import com.company.productapp.dao.ProductDao;
import com.company.productapp.dto.Product;
import com.company.productapp.exceptions.ProductException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
//@Component
@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductDao productDao;

    @Override
    public Product createNewProduct(Product newProduct) throws ProductException {
        // handle exceptions
        return productDao.addProduct(newProduct);
    }

    @Override
    public Product getProductById(Integer productId) throws ProductException {
        // handle exceptions
        return this.productDao.getProductById(productId);
    }

    @Override
    public Product updateProduct(Product product) throws ProductException {
        return null;
    }

    @Override
    public Product deleteProductById(Integer productId) throws ProductException {
        return null;
    }

    @Override
    public List<Product> getAllProducts() throws ProductException {
        return null;
    }

    @Override
    public List<Product> getAllProductsSortedByPrice() throws ProductException {
        return null;
    }
}
