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
        listUser.add(user);
        user = new User();
    }

    public void actionPrint() {
        for (User user1 : listUser) {
            System.out.println("===> " + user1);
        }
    }
}
