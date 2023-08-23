package com.products.apip.service;

import com.products.apip.entity.SaleDetail;
import com.products.apip.repository.SaleDetailRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class SaleDetailService {
    private final SaleDetailRepository sdRep;
    
    public void createSaleDetail(SaleDetail sd){
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
