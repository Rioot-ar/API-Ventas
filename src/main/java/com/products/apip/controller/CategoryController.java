package com.products.apip.controller;

import com.products.apip.entity.Category;
import com.products.apip.service.CategoryService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/category")
@RequiredArgsConstructor
public class CategoryController {
    
    private final CategoryService subServ;
    
    @PostMapping("/create")
    public void createCategory(@RequestBody Category subc){
        subServ.createCategory(subc);
    }
    
    @GetMapping("{id}")
    public Category findCategory(@PathVariable long id){
        return subServ.findCategory(id);
    }
    
    @GetMapping("/getall")
    public List<Category> findAllCategory(){
        return subServ.findAllCategory();
    }
    
    @DeleteMapping("/delete/{id}")
    public Category deleteCategory(@PathVariable long id){
        Category subc = subServ.findCategory(id);
        subServ.deleteCategory(id);
        return subc;
    }
}
