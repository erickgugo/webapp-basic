package com.webapp.entity;

import lombok.Data;

import javax.persistence.*;

@Data
//@Entity
//@Table(name = "nas")
public class Nas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nasname;
    private String shortname;
    private String type;
    private Long ports;
    private String secret;
    private String server;
    private String community;
    private String description  ;
}
