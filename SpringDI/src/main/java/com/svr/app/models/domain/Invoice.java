package com.svr.app.models.domain;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;


@Component
@RequestScope
public class Invoice implements Serializable {

    @Value("${invoice.description}")
    private String description;
    @Autowired
    private Client client;
    @Autowired
    private List<ItemInvoice> items;

    @PostConstruct
    public void init() {

        client.setUsername(client.getUsername().concat(" ").concat("Ts"));
        description = description.concat(" | Client: ").concat(client.getUsername());

        System.out.println(" PostConstruct() -> init() ");
    }


    @PreDestroy
    public void destroy() {

        System.out.println("Destroyed invoice: ".concat( description ));
    }


    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Client getClient() {
        return client;
    }
    public void setClient(Client client) {
        this.client = client;
    }
    public List<ItemInvoice> getItems() {
        return items;
    }
    public void setItems(List<ItemInvoice> items) {
        this.items = items;
    }

    

    
}
