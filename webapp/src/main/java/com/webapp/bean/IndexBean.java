package com.webapp.bean;


import com.webapp.entity.User;
//import com.webapp.entity2.MainUsers;

import lombok.Data;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by andre on 18/08/2022.
 */
@Data
@ManagedBean
@ViewScoped
public class IndexBean {

    private List<String> listNombre = new ArrayList<>();

    private User user;
    private List<User> listUser = new ArrayList<>();


    @PostConstruct
    public void init() {
        System.out.println("Entrando init");
        user = new User();
    }

    public void actionAdd() {
        System.out.println(user);
        //listUser.add(user);
        insertUser(user);
        init();
        listUser = getList();
    }

    public void actionPrint() {
        for (User user1 : listUser) {
            System.out.println("===> " + user1);
        }
    }

    public void insertUser(User usuario) {
        System.out.println("Insert: " + usuario);
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://127.0.0.1:3306/facebook";
            String user = "root";
            String password = "";

            conn = DriverManager.getConnection(url, user, password);
            System.out.println(conn);

            Statement stmt = conn.createStatement();
            String sql = "INSERT INTO " +
                    "usuarios(nombre, apellido, telfono, email, usuario, clave) " +
                    "VALUES (" +
                    usuario.getNombre() + "," +
                    usuario.getApellido() + "," +
                    usuario.getTelefono() + "," +
                    usuario.getEmail() + "," +
                    usuario.getUsuario() + "," +
                    usuario.getClave() +
                    ")";
            System.out.println(sql);
            stmt.executeUpdate(sql);


        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }


    public List<User> getList()
    {
        List<User> listAux= new ArrayList<>();
        //System.out.println("Insert: "+usuario);
    Connection conn = null;
        try

    {

        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://127.0.0.1:3306/facebook";
        String user = "root";
        String password = "";

        conn = DriverManager.getConnection(url, user, password);
        System.out.println(conn);

        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("select* from Usuarios");
        User u;
        while (rs.next()) {
            u = new User();

            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getInt(4) + " " + rs.getString(5) + " " + rs.getString(6) + "     " + rs.getString(7));
            u.setId(rs.getInt(1));
            u.setNombre(rs.getString(2));
            u.setApellido(rs.getString(3));
            u.setTelefono(rs.getInt(4));
            u.setEmail(rs.getString(5));
            u.setUsuario(rs.getString(6));
            u.setClave(rs.getString(7));
            listAux.add(u);
            //List<User> listUser= new ArrayList<>();

        }
    } catch(
    Exception ex)

    {
        ex.printStackTrace();
    }finally

    {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    //CODE
//return u;
       return listAux;
}

}
