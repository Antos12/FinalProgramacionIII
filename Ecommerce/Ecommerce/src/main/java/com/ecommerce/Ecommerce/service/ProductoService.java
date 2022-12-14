package com.ecommerce.Ecommerce.service;

import com.ecommerce.Ecommerce.model.Producto;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public interface ProductoService {
    public Producto save( Producto producto);
    public Optional<Producto> get(Integer id);
    public void update(Producto producto);
    public void delete(Integer id);
    public List<Producto> findAll();

}
