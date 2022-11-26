package com.paul.serializable;

import java.io.Serializable;

public class students implements Serializable {
    String name;
    int age;

    public students(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
