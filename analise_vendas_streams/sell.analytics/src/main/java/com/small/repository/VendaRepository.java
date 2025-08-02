package com.small.repository;

import com.small.model.Venda;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;


@ApplicationScoped
public class VendaRepository implements PanacheRepository<Venda> {
    
}
