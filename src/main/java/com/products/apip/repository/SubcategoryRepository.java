package com.products.apip.repository;

import com.products.apip.entity.Subcategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubcategoryRepository extends JpaRepository <Subcategory, Long> {
    
}
