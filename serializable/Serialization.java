package com.paul.serializable;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {
    public static void main(String[] args) throws IOException {

        students s = new students("paul", 43);
        FileOutputStream file1 = new FileOutputStream("C:/Users/PAUL TIMOTHY/Desktop/fileout/file.txt");
        ObjectOutputStream out = new ObjectOutputStream(file1);
        out.writeObject(s);
        out.close();
        file1.close();
        System.out.println("Success");
    }

}
