package com.products.apip.entity;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="subcategoria")
public class Subcategory {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private long idSubcategory;
    
    @Basic
    private String name;
}
