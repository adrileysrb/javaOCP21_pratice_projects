package com.small.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Venda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String vendedor;
    private String produto;
    private int quantidade;
    
    @Column(name="PRECO_UNITARIO")
    private double precoUnitario;
    
    private LocalDate data;
    
}

