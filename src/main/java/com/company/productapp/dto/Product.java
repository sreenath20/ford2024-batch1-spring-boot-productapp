package com.company.productapp.dto;

import java.time.LocalDate;

public class Product { // POJO : DTO
    private Integer id;
    private String name;
    private Double price;
    private LocalDate manufactureDate;
    private LocalDate expiryDate;

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", manufactureDate=" + manufactureDate +
                ", expiryDate=" + expiryDate +
                '}';
    }

    public Product(Integer id, String name, Double price, LocalDate manufactureDate, LocalDate expiryDate) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.manufactureDate = manufactureDate;
        this.expiryDate = expiryDate;
    }

    public Product() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }
}
