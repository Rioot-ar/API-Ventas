
package com.products.apip.controller;

import com.products.apip.entity.Products;
import com.products.apip.service.ProductsService;
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
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductsController {
    
    private final ProductsService prodServ;
    
    @PostMapping("/create")
    public void createProduct(@RequestBody Products prod){
        prodServ.saveProduct(prod);
    }
    
    @GetMapping("{id}")
    public Products findProduct(@PathVariable long id){
        return prodServ.findProduct(id);
    }
    
    @GetMapping("/getall")
    public List<Products> findAllProducts(){
        return prodServ.findAllProducts();
    }
    
    @DeleteMapping("/delete/{id}")
    public Products deleteProduct(@PathVariable long id){
        Products prod = prodServ.findProduct(id);
        prodServ.deleteProduct(id);
        return prod;
    }
}
