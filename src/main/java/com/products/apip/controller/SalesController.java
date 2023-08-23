package com.products.apip.controller;

import com.products.apip.service.SalesService;
import com.products.apip.entity.Sales;
import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("/sales")
@RequiredArgsConstructor
public class SalesController {
    private final SalesService salesService;

    @PostMapping("/create")
    public void createSale(@RequestBody Sales sale){
        salesService.saveSale(sale);
    }
    
    @PutMapping("/edit")
    public Sales editSale(@RequestBody Sales sale){
        salesService.saveSale(sale);
        return sale;
    }
    
    @GetMapping("{id}")
     public Sales findSale(@PathVariable long id) {
        return salesService.findSale(id);
    }

    @DeleteMapping("delete/{id}")
    public Sales deleteSale(@PathVariable long id){
        Sales pro = salesService.findSale(id);
        salesService.deleteSale(id);
        return pro;
    }
    
    @GetMapping("/getall")
    public List<Sales> findAllSales(){
        return salesService.findAllSales();
    }
}
