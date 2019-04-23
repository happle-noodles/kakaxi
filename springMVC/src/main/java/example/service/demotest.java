package example.service;

import example.dao.BAjztxxEntity;
import example.impl.demo1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class demotest {
    @Autowired
    private demo1 test;

    public String select(String scfy){
        Integer nscfy = Integer.parseInt(scfy);
        List<BAjztxxEntity> list = test.findAllByScfy(nscfy);
        return list.get(0).getAh();
    }

}
