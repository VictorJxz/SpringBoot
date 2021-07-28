package com.svr.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/variables")
public class RoutersController {

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("title", "Send path params ->  @PathVariable");
        return "variables/index";
    }

    @GetMapping("/string/{text}")
    public String variables(@PathVariable String text, Model model){
        model.addAttribute("title", "Receive path params ->  @PathVariable");
        model.addAttribute("result", "The text sent to the route is -> "+ text);
        return "variables/see";
    }

    @GetMapping("/string/{text}/{number}")
    public String variables(@PathVariable String text,@PathVariable Integer number, Model model){
        model.addAttribute("title", "Receive path params ->  @PathVariable");
        model.addAttribute("result", "The text sent to the route is -> "+ text + "The number sent is -> "+ number);
        return "variables/see";
    }
    
}
