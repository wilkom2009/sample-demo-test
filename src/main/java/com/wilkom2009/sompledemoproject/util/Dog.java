package com.wilkom2009.sompledemoproject.util;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Dog extends Animal {
    private String color;

    public Dog() {
        this.color = "Red";
    }

    public void move1(){
        log.info("Dog Move");
    }
}
