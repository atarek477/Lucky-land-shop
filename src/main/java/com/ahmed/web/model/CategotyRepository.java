package com.ahmed.web.model;


import com.ahmed.web.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategotyRepository  extends JpaRepository<Category, Integer> {
}
