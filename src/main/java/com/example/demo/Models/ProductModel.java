package com.example.demo.Models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "products")
public class ProductModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nameProduct;
    public String descriptionProduct;
    public double valueProduct;
    private int cantProduct;
    private int stateProduct;


    public ProductModel() {
    }

    public int getStateProduct() {
        return stateProduct;
    }

    public void setStateProduct(int stateProduct) {
        this.stateProduct = stateProduct;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getDescriptionProduct() {
        return descriptionProduct;
    }

    public void setDescriptionProduct(String descriptionProduct) {
        this.descriptionProduct = descriptionProduct;
    }

    public double getValueProduct() {
        return valueProduct;
    }

    public void setValueProduct(double valueProduct) {
        this.valueProduct = valueProduct;
    }

    public int getCantProduct() {
        return cantProduct;
    }

    public void setCantProduct(int cantProduct) {
        this.cantProduct = cantProduct;
    }
}
