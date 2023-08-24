package com.products.apip.service;

import com.products.apip.entity.Products;
import com.products.apip.entity.SaleDetail;
import com.products.apip.entity.Sales;
import com.products.apip.repository.ProductRepository;
import com.products.apip.repository.SaleDetailRepository;
import com.products.apip.repository.SalesRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class SaleDetailService {
    private final SaleDetailRepository sdRep;
    private final SalesRepository saleRepo;
    private final ProductRepository prodRepo;
    
    public void createSaleDetail(SaleDetail sd){
        Sales sale = saleRepo.findById(sd.getSale().getVentasId()).orElse(null);
        Products product = prodRepo.findById(sd.getProduct().getId_product()).orElse(null);
        sd.setProduct(product);
        sd.setSale(sale);
        sdRep.save(sd);
    }
    
    public SaleDetail findSaleDetail(long id){
        return sdRep.findById(id).orElse(null);
    }
    
    public List<SaleDetail> findAllSaleDetail(){
        return sdRep.findAll();
    }
    
    public void deleteSaleDetail(long id){
        sdRep.deleteById(id);
    }
}
