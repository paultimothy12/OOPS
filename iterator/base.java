package com.paul.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class base {
    // Ok, we use iterator to traverse 1 by 1 --> Collection interface(ArrayList,List...)
    // cursor waits outside---
    // .hasNext() returns "boolean", if any object is next to the cursor. use it in loop like while(itr.hasNext())
    // .next() returns <T>, next to the cursor. use it in print statement or assign to a variable and do something
    // .remove() removes the value in the object not from iterator use it in if(condition){ itr.remove(); }

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);

        //now we declare iterator
        Iterator<Integer> itr = al.iterator(); //it's like holding values of al into itr, but we are working on al

        while(itr.hasNext()){         //boolean
            Integer i= itr.next();    //entering while loop on first time, next() pointing index 0

            System.out.println(i);    // prints everything not affected by remove().

                if(i%2==0)
                    itr.remove();     // removes the values inside the object(al) ---> not from iterator

        }
        for(Integer a: al){
            System.out.println(a);    //prints the values of the object(al)
        }
    }
}
