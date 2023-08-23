package com.products.apip.repository;

import com.products.apip.entity.Sales;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalesRepository extends JpaRepository <Sales, Long>{
    
}
