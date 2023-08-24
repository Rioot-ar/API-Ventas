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
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.util.Date;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="ventas")
public class Sales {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long VentasId;
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    private String cliente;    
    private int total;   
    private String metodo_pago;
    
    @OneToMany(mappedBy = "sale",cascade = CascadeType.ALL,orphanRemoval=true)
    @JsonIgnore
    private List<SaleDetail> saledetail;
}
