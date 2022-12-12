package com.ecommerce.Ecommerce.service;

import java.util.List;

import com.ecommerce.Ecommerce.model.Orden;

public interface IOrdenService {
    List<Orden>findAll();
    Orden save (Orden orden);
    String generarNumeroOrden();
}
