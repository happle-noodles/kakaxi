package com.zk.springbootjpamysql.controller;

import com.zk.springbootjpamysql.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private PersonService ps;

    @RequestMapping("/test")
    public String say(){

        return ps.findAllPerson();
    }
}
