package com.example.demo;

import java.lang.String;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping(path="/") //link principal padre
public class Controller{
    //link segundo hijo
        @GetMapping(path="/") 
        public String home(){
            return "AT75524337 - Rodrigo Elguera";
        }
        @GetMapping(path="/codigo") 
        public String codigo(){
            return "AT75524337";
        }
        @GetMapping(path="/nombre") 
        public String nombrecompleto(){
            return "Rodrigo Elguera Amado";
        }
}