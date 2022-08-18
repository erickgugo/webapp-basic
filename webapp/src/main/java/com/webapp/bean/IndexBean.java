package com.webapp.bean;

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

    private String nombre;
    private List<String> listNombre = new ArrayList<>();

    @PostConstruct
    public void init() {
        System.out.println("Entrando init");
    }

    public void actionAdd() {
        listNombre.add(nombre);
        System.out.println(">>>: " + listNombre);
        nombre = "";
    }
}
