package day8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//Collections
//     |-------List(ArrayList, LinkedList)
//     |-------Set
//Map
public class Main1 {
    public static void main(String[] args) {
        //insert,remove:    LinkedList > ArrayList
        //get:              ArrayList  > LinkedList
        List<Integer> listA = new ArrayList<>();
        List<Integer> listL = new LinkedList<>();

        /*
        long t1 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            listA.add(0,i);
        }
        long t2 = System.currentTimeMillis();
        System.out.println("to insert 100000 values at index 0 in ArrayList cost:"+(t2-t1)+"ms");

        long t3 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            listL.add(0,i);
        }
        long t4 = System.currentTimeMillis();
        System.out.println("to insert 100000 values at index 0 in LinkedList cost:"+(t4-t3)+"ms");
        */
        for (int i = 0; i < 100000; i++) {
            listA.add(0,i);
            listL.add(0,i);
        }
        /*
        long t1 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            listA.remove(0);
        }
        long t2 = System.currentTimeMillis();
        System.out.println("to remove values at index 0 from ArrayList cost:"+(t2-t1)+"ms");

        long t3 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            listL.remove(0);
        }
        long t4 = System.currentTimeMillis();
        System.out.println("to insert values at index 0 from LinkedList cost:"+(t4-t3)+"ms");
        */

        long t1 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            listA.get(i);
        }
        long t2 = System.currentTimeMillis();
        System.out.println("get values from ArrayList cost:"+(t2-t1)+"ms");

        long t3 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            listL.get(i);
        }
        long t4 = System.currentTimeMillis();
        System.out.println("get values from LinkedList cost:"+(t4-t3)+"ms");


    }
}
