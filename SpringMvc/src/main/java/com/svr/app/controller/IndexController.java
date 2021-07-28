package com.svr.app.controller;

import java.util.Arrays;
import java.util.List;

import com.svr.app.model.UserModel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/app")
public class IndexController {

    @Value("${text.indexcontroller.index.title}")
    private String textIndex;
    @Value("${text.indexcontroller.profile.title}")
    private String textProfile;
    @Value("${text.indexcontroller.tolist.title}")
    private String textToList;

    @GetMapping( {"/index","/home","/",""} )
    public String index(Model model) {
        model.addAttribute("title",textIndex);
        return "index";
    }

    @GetMapping("/profile")
    public String profile( Model model ) {
        UserModel userModel = new UserModel();
        userModel.setUsername("Victor");
        userModel.setSurname("Jiménez");
        userModel.setEmail("virus@gmail.com");
        model.addAttribute("title", textProfile.concat( userModel.getUsername() ));
        model.addAttribute("user", userModel);
        return "profile";
    }

    @GetMapping("/list")
    public String list( Model model ) {
       /*  List<UserModel> users = Arrays.asList(new UserModel("Test1","Surname1","test@test.com"),
         new UserModel("Test2","Surname2","test2@test.com"), new UserModel("Test3","Surname3","test3@test.com") ); */
        model.addAttribute("title", textToList);
       /*  model.addAttribute("users", users); */
        return "list";
    }

    // Load data to more than one view
    @ModelAttribute("users")
    public List<UserModel> LoadUser( ){
        List<UserModel> users = Arrays.asList(new UserModel("Test1","Surname1","test@test.com"),
         new UserModel("Test2","Surname2","test2@test.com"), new UserModel("Test3","Surname3","test3@test.com") );
        return users;
    }
    
}
