package com.products.apip.service;

import com.products.apip.entity.Category;
import com.products.apip.entity.Subcategory;
import com.products.apip.repository.CategoryRepository;
import com.products.apip.repository.SubcategoryRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class SubcategoryService {
    
    private final SubcategoryRepository subRep;
    private final CategoryRepository catRep;
    
    public void createSubcategory(Subcategory subc){
        Category cat = catRep.findById(subc.getCategory().getIdCategory()).orElse(null);
        subc.setCategory(cat);
        subRep.save(subc);
    }
    
    public Subcategory findSubcategory(long id){
        return subRep.findById(id).orElse(null);
    }
    
    public List<Subcategory> findAllSubcategory(){
        return subRep.findAll();
    }
    
    public void deleteSubcategory(long id){
        subRep.deleteById(id);
    }
}
