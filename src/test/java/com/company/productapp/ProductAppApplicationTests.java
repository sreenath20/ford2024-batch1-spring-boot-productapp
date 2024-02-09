package com.company.productapp;

import com.company.productapp.dto.Product;
import com.company.productapp.exceptions.ProductException;
import com.company.productapp.service.ProductService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
//
// Product createNewProduct(Product newProduct) throws ProductException;
//		 Product getProductById(Integer productId)throws ProductException;
//		 Product updateProduct(Product product)throws ProductException;
//		 Product deleteProductById(Integer productId)throws ProductException;
//		 List<Product> getAllProducts()throws ProductException;
//		List<Product> getAllProductsSortedByPrice()throws ProductException;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@SpringBootTest
class ProductAppApplicationTests {

	// initialise test data
	@Autowired
	private ProductService productService;
	@BeforeAll
	public void beforeAllTestsCreateTestData(){

	}
	@Test
	public void createNewProductTest(){

		try {
			Assertions.assertNotNull(this.productService.createNewProduct(new Product(1,"Phone",44000.0, LocalDate.of(2023,01,15),null)));
		} catch (ProductException e) {
			Assertions.fail(e.getMessage());
		}

	}
	@Test
	public void getProductByIdTest(){

	}
	@Test
	public void updateProductTest(){

	}
	@Test
	public void deleteProductByIdTest(){

	}
	@Test
	public void getAllProductsTest(){

	}

}
