package com.svr.app.service;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Primary
//@Component("myServiceSimple")
public class MyService implements IService{
    
    @Override
    public String operation() {
        return "Running an important process simple...";
    }

}
