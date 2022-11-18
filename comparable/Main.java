package com.paul.comparable;

public class Main {
    public static void main(String[] args) {

        //----------Comparing two objects of same class----------
        // Override compareTo(), write the code for comparison inside...

        students s1= new students(3,"paul");
        students s2= new students(9,"timothy");

        //compareTo() is called and returns 0= same,
        // negative value, second object is higher,
        // positive value, first object is higher.
        if (s1.compareTo(s2) == 0)
            System.out.println("age is equal");
        else if (s1.compareTo(s2) > 0)
            System.out.println("s1 is higher");
        else System.out.println("s2 is higher");
    }
}
