package com.ecommerce.Ecommerce.service;

import java.util.Optional;

import com.ecommerce.Ecommerce.model.Usuario;

import antlr.collections.List;

public interface IUsuarioService {
    Optional<Usuario> findById(Integer id);
	
}
