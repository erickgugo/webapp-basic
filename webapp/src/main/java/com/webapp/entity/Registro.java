package com.webapp.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Data
@Entity

@Table(name = "zeus_plus_log-copy")

public class Registro implements Serializable
{
    @Id

    /*
    private Long id;

    private String nombre;
    private String apellido;

    @Column(name = "telfono")
    private Integer telefono;

    private String email;
    private String usuario;
    private String clave;
*/
    private Long id;

    private String pagina;
    private String evento;
    private String criterio;

    private String resultado;
    private String detalle;
    private String usuario;
    private String ip;
    private Timestamp fecha;

    public Registro() {

    }

    public Registro(long id, String pagina, String evento, String criterio, String resultado, String detalle, String usuario, String ip, Timestamp fecha) {
        this.id=id;
        this.pagina = pagina;
        this.evento = evento;
        this.criterio = criterio;
        this.resultado = resultado;
        this.detalle = detalle;
        this.usuario = usuario;
        this.ip = ip;
        this.fecha = fecha;
    }

/*
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




*/


}
