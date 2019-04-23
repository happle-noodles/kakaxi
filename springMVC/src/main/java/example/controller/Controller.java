package example.controller;

import example.service.demotest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;


@org.springframework.stereotype.Controller
@RequestMapping("/demoController")
public class Controller {

    @Autowired
    private demotest demoservice;

    @RequestMapping("/test")
    public String index(){
       /* String scfy = httpServletRequest.getParameter("scfy");
        String result = demotestservice.select(scfy);*/
        return "index";
    }
}
