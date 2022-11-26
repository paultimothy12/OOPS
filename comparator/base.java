package com.paul.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class base implements Comparator<students>{
    @Override
    public int compare(students o1, students o2) {
        if(o1.age==o2.age)
            return 0;
        else if (o1.age>=o2.age)
            return 1;
        else return -1;
    }
}
