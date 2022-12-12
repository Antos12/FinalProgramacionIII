package com.ecommerce.Ecommerce.service;

import java.util.Optional;

import com.ecommerce.Ecommerce.model.Usuario;

import antlr.collections.List;

public interface IUsuarioService {
    Optional findbyId(Integer id);
	Usuario save (Usuario usuario);
	Optional<Usuario> findById(Integer id);
    // List<Usuario> findAll();
	
	
	Optional<Usuario> findByEmail(String email);
}
