package com.ahmed.web.services;

import com.ahmed.web.model.Product;
import com.ahmed.web.model.ProductRepository;
import com.ahmed.web.model.User;
import com.ahmed.web.model.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserProductService {
    @Autowired
   private UserRepository userRepository;
    @Autowired
    private ProductRepository productRepository;

    public UserProductService(UserRepository userRepository, ProductRepository productRepository) {
        this.userRepository = userRepository;
        this.productRepository = productRepository;
    }
public void saveUserWithProducts(User user, List<Product> products){
        user.setProducts(products);
        userRepository.save(user);

    }
}
