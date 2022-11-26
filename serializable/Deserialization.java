package com.paul.serializable;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        students s=null;
        FileInputStream file = new FileInputStream("C:/Users/PAUL TIMOTHY/Desktop/fileout/file.txt");
        ObjectInputStream in = new ObjectInputStream(file);
        s = (students) in.readObject();
        in.close();
        file.close();
        System.out.println(s.name + " " + s.age);
    }
}
