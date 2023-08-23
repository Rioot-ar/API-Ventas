package com.products.apip.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name="subcategoria")
public class Subcategory {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private long idSubcategory;
    
    @Basic
    private String name;
        
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "fk_categoria")
    private Category category;    
    
    @OneToMany(mappedBy = "subcategory",cascade = CascadeType.ALL,orphanRemoval=true)
    @JsonIgnore
    private List<Products> products;    
}
