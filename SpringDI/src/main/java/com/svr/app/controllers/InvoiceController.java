package com.svr.app.controllers;

import com.svr.app.models.domain.Invoice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@RequestMapping("/invoice")
public class InvoiceController {
    
    @Autowired
    private Invoice invoice;

    @GetMapping("/list")
    public String list( Model model) {
        
        model.addAttribute("invoice", invoice);
        model.addAttribute("title", "Invoice example with dependency injection");
        return "invoice/list";
    }
    

}
