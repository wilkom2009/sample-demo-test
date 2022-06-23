package com.wilkom2009.sompledemoproject.controller;

import com.wilkom2009.sompledemoproject.util.Animal;
import com.wilkom2009.sompledemoproject.util.Dog;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/hello")
    public String sayHello() {
        Animal a = new Animal();
        a.move();
        Dog d = new Dog();
        d.move();
        return "Hello world";
    }

    @GetMapping
    public String welcom() {
        Animal a = new Animal();
        a.move();
        Dog d = new Dog();
        d.move();
        return "welcome API";
    }
}
