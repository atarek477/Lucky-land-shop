package com.ahmed.web.services;

import com.ahmed.web.model.Category;
import com.ahmed.web.model.CategotyRepository;
import com.ahmed.web.model.Product;
import com.ahmed.web.model.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;

@Service
public class PorductCategoryService {

    @Autowired
    ProductRepository productRepository;
    @Autowired
    CategotyRepository categotyRepository;

    public PorductCategoryService(ProductRepository productRepository, CategotyRepository categotyRepository) {
        this.productRepository = productRepository;
        this.categotyRepository = categotyRepository;
    }
    public void insertCategoryToProduct(int productId, int categoryId) {
        Optional<Product> productOptional = productRepository.findById(productId);
        Optional<Category> categoryOptional = categotyRepository.findById(categoryId);

        if (productOptional.isPresent() && categoryOptional.isPresent()) {
            Product product = productOptional.get();
            Category category = categoryOptional.get();

            product.getCategorySet().add(category);
            category.getProductSet().add(product);

            productRepository.save(product);
            categotyRepository.save(category);
        } else {
            throw new IllegalArgumentException("Product or Category not found");
        }
    }
}
