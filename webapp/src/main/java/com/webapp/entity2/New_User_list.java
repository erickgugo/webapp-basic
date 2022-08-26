package com.webapp.entity2;

import java.util.ArrayList;

public class New_User_list {
    private ArrayList<User_list> usuarios;

    public void getAllUserFromMainStore(ArrayList<User_list> list) {
        // first syntax
        this.usuarios = list;
        // Second syntax
        // this.books = (ArrayList<Book>) list.clone();

    }

    public void printUsers() {
        for (User_list b : this.usuarios) {
            System.out.println(b.getID() + " " + b.getNombre() + " " + b.getApellido() + " " + b.getTelefono() + " " + b.getEmail() + " " + b.getUsuario() + " " + b.getClave());
        }
    }
}
