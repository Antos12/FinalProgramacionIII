package com.ecommerce.Ecommerce.controller;

import java.util.Optional;

import org.slf4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ecommerce.Ecommerce.model.Producto;
import com.ecommerce.Ecommerce.model.Usuario;
import com.ecommerce.Ecommerce.service.ProductoService;

@Controller
@RequestMapping("/productos")
public class ProductoController{
    private final Logger Logger=LoggerFactory.getLogger(ProductoController.class);

    @Autowired
    private ProductoService productoService;

    @GetMapping("")
    public String show(Model model){
        model.addAttribute("productos", productoService.findAll());
        return "productos/show";
    }

    @PostMapping("/save")
    public String save(Producto producto){
        Logger.info("Este es el objeto producto{}",producto);
        Usuario u=new Usuario(1,"","","","","","","");
        producto.setUsuario(u);
        productoService.save(producto);
        return "redirect:/productos";
    }

    @GetMapping("/create")
    public String create(){
        return "productos/create";
    }

    @GetMapping("/edit/{id}")
	public String edit(@PathVariable Integer id, Model model) {
		Producto producto= new Producto();
		Optional<Producto> optionalProducto=productoService.get(id);
		producto= optionalProducto.get();
		
		Logger.info("Producto buscado: {}",producto);
		model.addAttribute("producto", producto);
		
		return "productos/edit";
	}

    @PostMapping("/update")
    public String update(Producto producto){
        productoService.update(producto);
        return "redirect:/productos";
    }

}