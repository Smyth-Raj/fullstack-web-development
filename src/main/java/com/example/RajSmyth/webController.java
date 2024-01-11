package com.example.RajSmyth;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class webController {
    
    @GetMapping("/html")
       @ResponseBody
       public Resource serveIndexPage() {
           return new ClassPathResource("static/index.html");
       }
    
    
}
