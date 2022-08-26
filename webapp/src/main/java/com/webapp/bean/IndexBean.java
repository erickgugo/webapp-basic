package com.webapp.bean;


import com.webapp.entity.User;
import com.webapp.entity2.MainUsers;
import com.webapp.entity2.New_User_list;
import com.webapp.entity2.User_list;
//import com.webapp.entity2.MainUsers;

import com.webapp.entity2.User_list;
import lombok.Data;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by andre on 18/08/2022.
 */
@Data
@ManagedBean
@ViewScoped
public class IndexBean {

//    private Integer id;
//    private String nombre;
//    private String apellido;
//    private Integer telefono;
//
//    private String email;
//
//    private String usuario;
//
//    private String clave;


    private List<String> listNombre = new ArrayList<>();

    private User user;
    private User_list user_list;

    private MainUsers main_users;

    private New_User_list new_user_list;

    private List<User> listUser = new ArrayList<>();

/*
    private String nombre;
    private List<String> listNombre = new ArrayList<>();
    private String nombre;
    private List<String> listNombre = new ArrayList<>();
    private String nombre;
    private List<String> listNombre = new ArrayList<>();
    private String nombre;
    private List<String> listNombre = new ArrayList<>();
    private String nombre;
    private List<String> listNombre = new ArrayList<>();
    private String nombre;
    private List<String> listNombre = new ArrayList<>();
*/

    @PostConstruct
    public void init() {
        System.out.println("Entrando init");
        user = new User();
    }

    public void actionAdd() {
//        System.out.println(">>>: " + id);
//        System.out.println(">>>: " + nombre);
//        System.out.println(">>>: " + apellido);
//        System.out.println(">>>: " + telefono);
//        System.out.println(">>>: " + email);
//        System.out.println(">>>: " + usuario);
//        System.out.println(">>>: " + clave);

//        user = new User();
//        user.setId(id);
//        user.setNombre(nombre);
//        user.setApellido(apellido);
//        user.setTelefono(telefono);
//        user.setEmail(email);
//        user.setUsuario(usuario);
//        user.setClave(clave);
        System.out.println(user);

        listUser.add(user);

//        nombre = apellido = email = usuario = clave = null;
//        id = telefono = null;
        user = new User();
    }

    public void actionPrint() {
//        main_users= new MainUsers();
//        main_users.add(new User_list(id,nombre,apellido,telefono,email,usuario,clave));
//        new_user_list=new New_User_list();
//        new_user_list.getAllUserFromMainStore(main_users.getUsuarios());
//        new_user_list.printUsers();
//        nombre = apellido =email=usuario=clave= null;
//        id=telefono = null;
        for (User user1 : listUser) {
            System.out.println("===> " + user1);
        }
    }
}
