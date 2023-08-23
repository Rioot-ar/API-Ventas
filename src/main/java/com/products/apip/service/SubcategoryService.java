package com.products.apip.service;

import com.products.apip.entity.Subcategory;
import com.products.apip.repository.SubcategoryRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class SubcategoryService {
    
    private final SubcategoryRepository subRep;
    
    public void createSubcategory(Subcategory subc){
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
