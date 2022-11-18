package com.paul.polymorphism.overloading;

public class overloading {
    void display(int age){
        System.out.println(age);
    }
    void display(int age, String name){
        System.out.println(age+" "+name);
    }
    void display(String name){
        System.out.println(name);
    }

    public static void main(String[] args) {
        //-------Overloading:---------->
        // Same method name,
        // Different number of parameters,
        // Datatype of the parameter must be same as method declared.
        overloading o=new overloading();
        o.display(23);
        o.display(23,"paul");
        o.display("paul");
    }
}
