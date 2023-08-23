package com.products.apip.service;

import com.products.apip.repository.SalesRepository;
import com.products.apip.entity.Sales;
import java.util.List;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SalesService {
    
    private final SalesRepository saleRepo;

    public void saveSale(Sales sale){
        saleRepo.save(sale);
    }
    
    public Sales findSale(long id) {
        return saleRepo.findById(id).orElse(null);
    }
    
    public void deleteSale(long id) {
        saleRepo.deleteById(id);
    }
    
    public List<Sales> findAllSales(){
        return saleRepo.findAll();
    }
    
}