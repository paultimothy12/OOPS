package com.paul.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Main{
    public static void main(String[] args) {
        ArrayList<students> al= new ArrayList<>();
        al.add(new students("paul",43));
        al.add(new students("timothy",23));

        al.sort(new base());

        for(students s: al){
            System.out.println(s.age+" "+s.name);
        }
    }
}