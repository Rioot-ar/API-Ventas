package com.products.apip.repository;

import com.products.apip.entity.SaleDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaleDetailRepository extends JpaRepository <SaleDetail,Long>{
    
}
