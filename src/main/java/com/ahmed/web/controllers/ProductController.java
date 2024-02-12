package com.ahmed.web.controllers;

import com.ahmed.web.model.Product;
import com.ahmed.web.services.ProductService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    ProductService productService;



    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    @GetMapping("api/get/product")
    public List<Product> getAllProductController() {
        return productService.getAllProduct();
    }

    @PostMapping("api/insert/product")
    public void insertProductController(Product product) {
        productService.insertProduct(product);
    }

    @DeleteMapping("api/delete/product")
    public void deleteProductController(Product product) {
        productService.deleteProduct(product);
    }


}
