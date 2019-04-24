package com.zk.springbootjpamysql.service;

import com.zk.springbootjpamysql.impl.PersonImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    private PersonImpl pl;

    public String findAllPerson(){
        return pl.findAll().toString();
    }

}
