package com.paul.comparable;

public class students implements Comparable<students>{
    int age;
    String name;

    public students(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(students o) {  //takes object as parameter
        //------We are comparing age and returns 0,>0,<0 ------>
        int diff= this.age-o.age;
        return diff;
    }

}
