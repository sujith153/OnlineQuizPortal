package com.sujith;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MainController {

	@RequestMapping("/")
    public String hello(){
        return "Hello World";
    }    

}
