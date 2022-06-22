package com.wilkom2009.sompledemoproject.util;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Animal {
    protected String name;

    public Animal() {
        this.name = "Animal";
    }

    public void move() {
        log.info("Move");
    }
}
