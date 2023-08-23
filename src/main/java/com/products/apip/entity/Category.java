package com.products.apip.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="categoria")
public class Category {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private long idCategory;
    
    @Basic
    private String name;
   
    @OneToMany(mappedBy = "category",cascade = CascadeType.ALL,orphanRemoval=true)
    @JsonIgnore
    private List<Subcategory> subcategories;
}
