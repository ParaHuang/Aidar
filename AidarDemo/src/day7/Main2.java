package day7;

import java.util.ArrayList;
import java.util.List;

//Collections
//     |-------List(ArrayList, LinkedList)
//     |-------Set
//Map
public class Main2 {
    public static void main(String[] args) {
//        int[] arr = new int[5];

//        initialize
//        ArrayList list = new ArrayList();
//        reference type change
//        List list = new ArrayList();

        List list = new ArrayList();
        //add values
        list.add("hello");
        list.add(true);
        list.add(3.14);
        list.add("water");
        list.add(23);
        System.out.println(list);
        //get single value
        Object x = list.get(2);
        System.out.println(x);
    }
}
