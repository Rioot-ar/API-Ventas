package com.products.apip.service;

import com.products.apip.entity.Category;
import com.products.apip.repository.CategoryRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class CategoryService {
    
    private final CategoryRepository subRep;
    
    public void createCategory(Category subc){
        subRep.save(subc);
    }
    
    public Category findCategory(long id){
        return subRep.findById(id).orElse(null);
    }
    
    public List<Category> findAllCategory(){
        return subRep.findAll();
    }
    
    public void deleteCategory(long id){
        subRep.deleteById(id);
    }
}
