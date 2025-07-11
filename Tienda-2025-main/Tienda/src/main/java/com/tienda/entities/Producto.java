package com.tienda.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.util.logging.Logger;


@Entity
@Table(name = "productos")
public class Producto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String nombre;
    @Min(value = 100, message = "El precio es obligatorio")
    @NotNull(message = "El precio no puede ser nulo")
    private Double precio;
    
    public Producto()   {
        // Constructor vacío necesario para JPA
    }

    public Producto(String nombre, Double precio)   {
        this.nombre = nombre;
        this.precio = precio;
    }
    
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    
    
    
    
    
    
    
}

