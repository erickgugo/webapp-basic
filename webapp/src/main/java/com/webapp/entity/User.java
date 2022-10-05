package com.webapp.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "usuarios")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String apellido;

    @Column(name = "telfono")
    private Integer telefono;

    private String email;
    private String usuario;
    private String clave;

    public User() {

    }

    public User(String nombre, String apellido, Integer telefono, String email, String usuario, String clave) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
        this.usuario = usuario;
        this.clave = clave;
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

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido() {
        return apellido;
    }
    public Integer getTelefono() {
        return telefono;
    }
    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }


    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }






    public String getClave() {
        return clave;
    }
    public void setClave(String clave) {
        this.clave = clave;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono
                +", email=" + email + ", usuario=" + usuario + ", clave=" + clave
                + "]";
    }

}



