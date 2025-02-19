package proyectois.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController

public class helloWorldRestController {

    @GetMapping("/hello")
    public String helloSpring(){
        return "Hola Spring!";
    }

}
