package com.example.demo4.services;

import com.example.demo4.entity.Category;
import com.example.demo4.repository.ICategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServices {
    @Autowired
    private ICategoryRepository categoryRepository;
    public List<Category> getAllCategories() {return categoryRepository.findAll();}
    public  Category getCategoryByid(Long id){return categoryRepository.findById(id).orElse(null);}
    public  Category saveCategory(Category category){return categoryRepository.save(category);}
    public void deleteCategory(Long id){categoryRepository.deleteById(id);}
}