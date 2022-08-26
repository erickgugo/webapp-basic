
package com.webapp.entity2;

import lombok.Data;

import java.util.ArrayList;

@Data
public class User_list {
    int ID;
    String nombre;
    String apellido;
    int telefono;
    String email;
    String usuario;
    String clave;

    public User_list(int ID, String nombre, String apellido, int telefono, String email, String usuario, String clave)  {
        this.ID=ID;
        this.nombre=nombre;
        this.apellido=apellido;
        this.telefono=telefono;
        this.email=email;
        this.usuario=usuario;
        this.clave=clave;
    }
    public int getID() {
        return ID;
    }
    public void setID(int ID)
    {this.ID = ID;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre)
    {this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido)
    {this.apellido = apellido;}
    public int getTelefono() {
        return telefono;
    }
    public void setTelefono(int telefono)
    {this.telefono = telefono;}
    public String getEmail() {
        return email;
    }
    public void setEmail(String email)
    {this.email =email;}

    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario)
    {this.usuario = usuario;}
    public String getClave() {
        return clave;
    }
    public void setClave(String clave)
    {this.nombre = clave;}
}

