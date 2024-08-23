package com.example.demo.Controllers;


import com.example.demo.Models.ProductModel;
import com.example.demo.Repositories.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(value = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE })
@RequestMapping("/api/products")
public class ProductsController {

    @Autowired
    private ProductsRepository productsRepository;


    @GetMapping
    public List<ProductModel> getAll() {
        return productsRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductModel> findByPk(@PathVariable int id) {
        return productsRepository.findById((long) id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ProductModel save(@RequestBody ProductModel product) {
        return productsRepository.save(product);
    }

}
