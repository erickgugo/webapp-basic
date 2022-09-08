package com.webapp.bean;


import com.webapp.entity.Nas;
import com.webapp.entity.User;
import com.webapp.model.NasRepository;
import lombok.Data;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

//import com.webapp.entity2.MainUsers;

/**
 * Created by andre on 18/08/2022.
 */
@Component
@Log4j2
@Data
@ManagedBean
@ViewScoped
public class NasBean implements Serializable {

//    @ManagedProperty(value = "#{nasRepository}")
    @Autowired
    private NasRepository nasRepository;

    private List<Nas> nasList;

    @PostConstruct
    public void init() {
        log.debug("init: "+nasRepository);
        nasList = nasRepository.findAll();
    }
}
