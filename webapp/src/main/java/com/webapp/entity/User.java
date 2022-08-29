package com.webapp.entity;

import lombok.Data;

@Data
public class User {
    private Integer id;
    private String nombre;
    private String apellido;
    private Integer telefono;
    private String email;
    private String usuario;
    private String clave;


}
