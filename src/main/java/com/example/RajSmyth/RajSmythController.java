package com.example.RajSmyth;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RajSmythController {
    
    @RequestMapping("/start")
    public String listen() {
        return "Successfully implementeds................................................................\r\n" + //
                "import org.springframework.web.bind.annotation.RequestMapping;\r\n" + //
                "import org.springframework.web.bind.annotation.RestController;";
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