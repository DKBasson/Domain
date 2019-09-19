package za.ac.cput.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @GetMapping("/")
    @ResponseBody
    public String homePage(){
        return "Welcome to Deklerk Bassons Capstone Project";
    }

}
