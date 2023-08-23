package com.products.apip.controller;

import com.products.apip.entity.SaleDetail;
import com.products.apip.service.SaleDetailService;
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
@RequestMapping("/saledetail")
@RequiredArgsConstructor
public class SaleDetailController {
    private final SaleDetailService sdServ;
    
    @PostMapping("/create")
    public void createSaleDetail(@RequestBody SaleDetail sd){
        sdServ.createSaleDetail(sd);
    }
    
    @GetMapping("{id}")
    public SaleDetail findSaleDetail(@PathVariable long id){
        return sdServ.findSaleDetail(id);
    }
    
    @GetMapping("/getall")
    public List<SaleDetail> findAllSaleDetail(){
        return sdServ.findAllSaleDetail();
    }
    
    @DeleteMapping("/delete/{id}")
    public SaleDetail deleteSaleDetail(@PathVariable long id){
        SaleDetail sd = sdServ.findSaleDetail(id);
        sdServ.deleteSaleDetail(id);
        return sd;
    }
}
