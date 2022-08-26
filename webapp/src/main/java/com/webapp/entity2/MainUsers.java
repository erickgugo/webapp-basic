package com.webapp.entity2;

import java.util.ArrayList;

public class MainUsers {
    private ArrayList<User_list> usuarios;

    public ArrayList<User_list> getUsuarios() {
        return usuarios;

    }

    public MainUsers() {
        usuarios = new ArrayList<User_list>();
    }

    public void add(User_list object) {
        usuarios.add(object);
    }
}
