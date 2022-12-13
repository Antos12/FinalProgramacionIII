package com.ecommerce.Ecommerce.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.Ecommerce.model.Usuario;
import com.ecommerce.Ecommerce.repository.UsuarioRepository;

/**
 * UsuarioServiceImpl
 */
@Service
public class UsuarioServiceImpl implements IUsuarioService{

    @Autowired
    private UsuarioRepository usuarioRepository;

    // @Override
    // public Optional findbyId(Integer id) {
     
    //     return usuarioRepository.findById(id);
    // }

    @Override
    public Optional<Usuario> findById(Integer id) {
        // TODO Auto-generated method stub
        return usuarioRepository.findById(id);
    }

    // @Override
    // public Usuario findById(int i) {
    //     // TODO Auto-generated method stub
    //     return usuarioRepository.findById(id);
    // }

   

    // @Override
    // public Usuario save(Usuario usuario) {
        
    //     return usuarioRepository.save(usuario);
    // }

    // @Override
    // public Optional<Usuario> findByEmail(String email) {
        
    //     return usuarioRepository.findByEmail(email);
    // }

    // @Override
    // public Optional<Usuario> findById(Integer id) {
      
    //     return usuarioRepository.findById(id);
    // }



  

    
}