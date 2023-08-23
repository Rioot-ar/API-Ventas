package com.products.apip.controller;

import com.products.apip.entity.Subcategory;
import com.products.apip.service.SubcategoryService;
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
@RequestMapping("/subcategory")
@RequiredArgsConstructor
public class SubcategoryController {
    
    private final SubcategoryService subServ;
    
    @PostMapping("/create")
    public void createSubcategory(@RequestBody Subcategory subc){
        subServ.createSubcategory(subc);
    }
    
    @GetMapping("{id}")
    public Subcategory findSubcategory(@PathVariable long id){
        return subServ.findSubcategory(id);
    }
    
    @GetMapping("/getall")
    public List<Subcategory> findAllSubcategory(){
        return subServ.findAllSubcategory();
    }
    
    @DeleteMapping("/delete/{id}")
    public Subcategory deleteSubcategory(@PathVariable long id){
        Subcategory subc = subServ.findSubcategory(id);
        subServ.deleteSubcategory(id);
        return subc;
    }
}
