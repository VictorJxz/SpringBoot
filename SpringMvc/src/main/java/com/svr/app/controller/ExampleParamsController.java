package com.svr.app.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@RequestMapping("/params")
public class ExampleParamsController {

    @GetMapping("/")
    public String index() {
        return "params/index";
    }

    @GetMapping(value="/string")
    public String params(@RequestParam(name="text", required = false, defaultValue = "Some of value..." ) String text, Model model ) {
        model.addAttribute("result","The text sent is : " + text);
        return "params/see";
    }

    @GetMapping(value="/mix-params")
    public String params(@RequestParam String greetings,@RequestParam Integer number, Model model ) {
        model.addAttribute("result","The greeting sent is : " + greetings + " the number is : " + number);
        return "params/see";
    }

    @GetMapping(value="/mix-params-request")
    public String params(HttpServletRequest request, Model model ) {
        String greetings = request.getParameter("greetings");
        Integer number = null;
        try {
            number = Integer.parseInt( request.getParameter("number") ) ;
        } catch ( NumberFormatException e){
            number = 0;
        }
        model.addAttribute("result","The greeting sent is : " + greetings + " the number is : " + number);
        return "params/see";
    }
    
    
}
