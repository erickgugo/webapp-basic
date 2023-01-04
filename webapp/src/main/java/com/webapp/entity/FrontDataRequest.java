package com.webapp.entity;

import lombok.Data;

import java.util.Date;
//import com.webapp.bean.ProyectoFinalBean;

@Data
public class FrontDataRequest {
    private String usuario;
    private String ip;
    private String pagina;
    private String evento;
    private Date fechaInicio;
    private Date fechaFinal;
}




