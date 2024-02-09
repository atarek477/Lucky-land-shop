package com.ahmed.web.services;

import com.ahmed.web.model.Category;
import com.ahmed.web.model.CategotyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategotyRepository categotyRepository;

    public CategoryService(CategotyRepository categotyRepository) {
        this.categotyRepository = categotyRepository;
    }

    public List<Category> getAllCategories() {
        return categotyRepository.findAll();
    }

    public void insertCategories(Category category) {
        categotyRepository.save(category);
    }

    public void deleteCategories(Category category) {
        categotyRepository.delete(category);
    }

}
