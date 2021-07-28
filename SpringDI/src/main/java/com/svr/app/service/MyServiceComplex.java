package com.svr.app.service;


import org.springframework.stereotype.Component;

//@Component("myServicePrincipal")
public class MyServiceComplex implements IService{
    
    @Override
    public String operation() {
        return "Running an important process complex...";
    }

}
