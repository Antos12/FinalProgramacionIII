package com.ecommerce.Ecommerce.model;

import java.util.List;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.metamodel.ListAttribute;



import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
@Table(name="usuarios")

public class Usuario{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String  nombre;
    private String  username;
    private String  email;
    private String  direccion;
    private String  telefono;
    private String  tipo;
    private String  password;

    @OneToMany(mappedBy = "usuario")
    private List<Producto>productos;

    @OneToMany(mappedBy = "usuario")
    private List<Orden>ordenes;

    public Usuario() {
    }

    public Usuario(Integer id, String nombre, String username, String email, String direccion, String telefono,
            String tipo, String password) {
        this.id = id;
        this.nombre = nombre;
        this.username = username;
        this.email = email;
        this.direccion = direccion;
        this.telefono = telefono;
        this.tipo = tipo;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getTipo() {
        return tipo;
    }

    public String getPassword() {
        return password;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {
        return "Usuario [id=" + id + ", nombre=" + nombre + ", username=" + username + ", email=" + email
                + ", direccion=" + direccion + ", telefono=" + telefono + ", tipo=" + tipo + ", password=" + password
                + "]";
    }

    
    
    
}