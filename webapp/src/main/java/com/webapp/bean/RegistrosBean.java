package com.webapp.bean;

import com.webapp.entity.Registro;
import com.webapp.entity.User;
import com.webapp.model.RegistroRepository;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedProperty;
import java.util.List;

public class RegistrosBean {
    @ManagedProperty(value = "#{registroRepository}")
    private RegistroRepository registroRepository;
    private List<Registro> registrosList;
    private List<Registro>registros;



    private List<Registro>noregistros;

    private Registro registro;

    private String input;
    //private List<User> findByUser(String usuario);

    private List<Registro>Registros;

    private Registro selectedRegistro;

    private List<Registro>selectedRegistros;

    //private List<SortMeta> sortBy;
    @PostConstruct
    public void init() {
        System.out.println("Entrando init");
        registro = new Registro();

        loadAll();

    }
    public List<Registro>getRegistros(){
        return Registros;
    }
    public  Registro getSelectedRegistro(){
        return selectedRegistro;
    }

    public void setSelectedRegistro(Registro selectedRegistro){
        this.selectedRegistro=selectedRegistro;
    }

    public List<Registro>getSelectedRegistros(){
        return selectedRegistros;
    }

    public void loadAll() {
//        registrosList = registroRepository.findAll();

        //userList=userRepository.save
    }

    public void setSelectedRegistros(List<Registro> selectedRegistros)
    {
        this.selectedRegistros = selectedRegistros;
    }
    public void actionAdd()
    {

        saveRegistro();
        init();
    }

    public void actionFind()
    {

        findUser();
        registrosList=registros;

    }

    public void actionClear()
    {


        loadAll();
        registro.setUsuario("");
    }


    public void findUser() {
        registros = registroRepository.findByUsuario(registro.getUsuario());//"erickgugo"

        registros.forEach((u) -> {
            ;
            System.out.println(u.getId());
            System.out.println(u.getPagina());
            System.out.println(u.getEvento());
            System.out.println(u.getCriterio());
            System.out.println(u.getResultado());
            System.out.println(u.getDetalle());
            System.out.println(u.getUsuario());
            System.out.println(u.getIp());
            System.out.println(u.getFecha());
        });
    }
    public void cleanUser() {
        registros = registroRepository.findByUsuario("1");
        if (registros != null) {
            noregistros = registros;
            noregistros.remove(registros);

        }


        noregistros.forEach((u) -> {
            ;
            System.out.println(u.getId());
            System.out.println(u.getPagina());
            System.out.println(u.getEvento());
            System.out.println(u.getCriterio());
            System.out.println(u.getResultado());
            System.out.println(u.getDetalle());
            System.out.println(u.getUsuario());
            System.out.println(u.getIp());
            System.out.println(u.getFecha());
        });
    }



    public void saveRegistro() {


//        registroRepository.save(registro);
        System.out.println("este es el usuario guardado"+registro);
        System.out.print("ID: " + registro.getId());
        System.out.print(", Nombre: " + registro.getPagina());
        System.out.print(", Apellido: " + registro.getEvento());
        System.out.println(", Telefono: " + registro.getResultado());
        System.out.print("Email: " + registro.getDetalle());
        System.out.print(", Usuario: " + registro.getUsuario());
        System.out.print(", Clave: " + registro.getIp());
        System.out.print(", Usuario: " + registro.getFecha());
    }


    public void actionBorrar()
    {
        for (Registro registro1 : registrosList) {
            System.out.println("BORRANDO: "+registro1.getId());

            registroRepository.removeByUsuario(registro1.getUsuario());
        }
        loadAll();
    }

    public void actionBorrarCheck()
    {
        for (Registro registro1 : selectedRegistros) {
            System.out.println("BORRANDO: "+registro1.getUsuario());

            registroRepository.removeByUsuario(registro1.getUsuario());
        }
        loadAll();
    }
    public void actionBorrarPorInput()
    {
        for (Registro registro1 : registrosList) {
            System.out.println("BORRANDO: "+registro1.getId());

            registroRepository.select(registro1.getUsuario());
        }
        loadAll();
    }


    public  void  actionSelect()
    {
        System.out.println(input);

        registrosList=registroRepository.select(input);


    }
}
