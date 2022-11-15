package com.ecommerce.Ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.Ecommerce.model.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer> {

    
}
