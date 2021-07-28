package com.svr.app;


import java.util.Arrays;
import java.util.List;

import com.svr.app.models.domain.ItemInvoice;
import com.svr.app.models.domain.Product;
import com.svr.app.service.IService;
import com.svr.app.service.MyService;
import com.svr.app.service.MyServiceComplex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {


    @Bean("myServiceSimple")
    public IService registryMyService() {
        return new MyService();
    }

    @Primary
    @Bean("myServiceComplex")
    public IService registryMyServiceComplex() {
        return new MyServiceComplex();
    }

    @Bean("itemsInvoice")
    public List<ItemInvoice> registryItems() {
        
        Product product = new Product("Camara sony", 100);
        Product product01 = new Product("Bicicleta Bianchi aro 26", 200);

        ItemInvoice linea1 = new ItemInvoice(product, 2);
        ItemInvoice linea2 = new ItemInvoice(product01, 4);

        return Arrays.asList( linea1, linea2);
    }

    @Primary
    @Bean("itemsInvoiceOffice")
    public List<ItemInvoice> registryItemsOffice() {
        
        Product product = new Product("Monitor LG LCD 24", 250);
        Product product01 = new Product("Notebook Asus", 500);
        Product product02 = new Product("Impresora HP Multifuncional", 80);
        Product product03 = new Product("Escritorio Oficina", 300);

        ItemInvoice linea1 = new ItemInvoice(product, 2);
        ItemInvoice linea2 = new ItemInvoice(product01, 1);
        ItemInvoice linea3 = new ItemInvoice(product02, 1);
        ItemInvoice linea4 = new ItemInvoice(product03, 1);

        return Arrays.asList( linea1, linea2, linea3, linea4);
    }



    
    
}
