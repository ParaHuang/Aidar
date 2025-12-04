package day10;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        //use list to save values in the same type , or the same description
        List list = new ArrayList();
        list.add("Lily");       //name
        list.add(18);           //age
        list.add("female");     //gender
        list.add(1.87);   //height

        System.out.println("name is "+list.get(0));
        System.out.println("age is "+list.get(1));
        System.out.println("gender is "+list.get(2));
        System.out.println("height is "+list.get(3));
    }
}
