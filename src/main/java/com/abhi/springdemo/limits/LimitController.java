package com.abhi.springdemo.limits;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitController {

    @Autowired
    private LimitConfiguration limitConfiguration;
    @GetMapping("/limits")
    public Limit retriveLimit(){
        return new Limit(limitConfiguration.getMinimum(),limitConfiguration.getMaximum());
    }
}
