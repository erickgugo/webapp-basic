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
        listUser = getList();
    }

    public void actionAdd() {
        System.out.println(user);
        //listUser.add(user);
        insertUser(user);
        init();
    }

    public void actionPrint() {
        for (User user1 : listUser) {
            System.out.println("===> " + user1);
        }
    }

   /* public void actionEdit() {
        for (User user1 : listUser) {
            System.out.println("===> " + user1);
        }
    }*/

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

            //System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getInt(4) + " " + rs.getString(5) + " " + rs.getString(6) + "     " + rs.getString(7));
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


    public void actionDelete(){
        System.out.println("Eliminando a "+user.getId());
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://127.0.0.1:3306/facebook";
            String user_db = "root";
            String password = "";
            conn = DriverManager.getConnection(url, user_db, password);
            Statement stmt = conn.createStatement();
            String sql = "DELETE FROM usuarios where id="+user.getId();
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
        init();
    }

    public void actionEdit(){
        System.out.println("Editando a "+user.getId());
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://127.0.0.1:3306/facebook";
            String user_db = "root";
            String password = "";
            String QUERY = "SELECT ID, nombre, apellido, telfono, email, usuario, clave FROM  usuarios";
            conn = DriverManager.getConnection(url, user_db, password);
            Statement stmt = conn.createStatement();
            String sql = "UPDATE usuarios " +
                    "SET nombre="+user.getNombre()+",apellido="+user.getApellido()+",telfono="+user.getTelefono()+", email="+user.getEmail()+",usuario="+user.getUsuario()+", clave="+user.getClave()+ " WHERE id="+user.getId();
            System.out.println(sql);
            stmt.executeUpdate(sql);
            ResultSet rs = stmt.executeQuery(QUERY);
            //User n;
            while(rs.next()){
                //Display values
                /*
                n = new User();

                //System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getInt(4) + " " + rs.getString(5) + " " + rs.getString(6) + "     " + rs.getString(7));
                n.setId(rs.getInt(1));
                n.setNombre(rs.getString(2));
                n.setApellido(rs.getString(3));
                n.setTelefono(rs.getInt(4));
                n.setEmail(rs.getString(5));
                n.setUsuario(rs.getString(6));
                n.setClave(rs.getString(7));
                listAuxn.add(n);
                */
                System.out.print("ID: " + rs.getInt(1));
                System.out.print(", Nombre: " + rs.getString(2));
                System.out.print(", Apellido: " + rs.getString(3));
                System.out.println(", Telefono: " + rs.getInt(4));
                System.out.print("Email: " + rs.getString(5));
                System.out.print(", Clave: " + rs.getString(6));
                System.out.print(", Usuario: " + rs.getString(7));



            }
            rs.close();
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
        init();
    }
}
