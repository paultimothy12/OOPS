package com.paul.polymorphism.overriding;

public class child extends parent{
    @Override
    void display(){
        System.out.println("child class");
    }

    public static void main(String[] args) {
        //----------Overriding--------->
        // Same method name,
        // We create object c1 for child class. if we call a method using c1,
        // java checks for the method inside child class and execute.
        // if not available, method in parent class will be executed.

        child c1=new child();
        c1.display();
    }
}
