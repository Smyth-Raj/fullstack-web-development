package com.example.RajSmyth;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RajSmythController {
    
    @RequestMapping("/start")
    public String listen() {
        return "You have hits the /start router !";
    }

    @RequestMapping("/two")
    public String listenTwo() {
        return "Java";

    }
    @RequestMapping("/Raj")
    public String Raj(){
        return "RAJ";
    }
 
}