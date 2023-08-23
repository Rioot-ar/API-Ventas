
package com.products.apip.service;

import com.products.apip.entity.Products;
import com.products.apip.repository.ProductRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductsService {
    private final ProductRepository prodRep;
    
    public void saveProduct(Products prod){
        prodRep.save(prod);
    }
    
    public Products findProduct(long id){
        return prodRep.findById(id).orElse(null);
    }
    
    public List<Products> findAllProducts(){
        return prodRep.findAll();
    }
    
    public void deleteProduct(long id){
        prodRep.deleteById(id);
    }
}
