package com.example.demo;

import java.lang.String;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping(path="/") //link principal padre
public class Controller{
    //link segundo hijo
        @GetMapping(path="/mundo") 
        public String home(){
            return "AT75524337 - Rodrigo Elguera";
        }
}