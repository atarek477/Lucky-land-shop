package com.ahmed.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServices {
    @Autowired
    CategotyRepository categotyRepository;

    public CategoryServices(CategotyRepository categotyRepository) {
        this.categotyRepository = categotyRepository;
    }

    public List<Category> getAllCategories(){
        return categotyRepository.findAll();
    }
    public void insertCategories(Category category){
        categotyRepository.save(category);
    }
    public void deleteCategories(Category category){
        categotyRepository.delete(category);
    }

}
