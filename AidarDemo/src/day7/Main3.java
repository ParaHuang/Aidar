package day7;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Main3 {
    public static void main(String[] args) {
        //generic: data restriction
        List<String> list = new ArrayList<>();
        //1.add
        list.add("gold");
        list.add("wood");
        list.add("water");
        list.add(0,"fire");//insert
        list.add("dirt");
        list.add("fire");
        System.out.println(list);
        //2.get
        String x = list.get(0);
        System.out.println(x);
        //3.size
        System.out.println(list.size());

        //4.get element by for loop
//        for(int i=0 ; i<list.size() ; i++){   //i is the index
//            System.out.println(list.get(i));
//        }
        //for-each / enhanced for loop
        for(String e:list){
            System.out.println(e);
        }
        //5.remove
        //directly, returns the result of if you remove successfully
//        boolean isSuccess = list.remove("fireeeee");
//        System.out.println(list);
//        System.out.println(isSuccess);
        //by index,return the element just removed
        String e = list.remove(0);
        System.out.println(list);
        System.out.println(e+" is removed");
        //6.contains
        System.out.println(list.contains("gold"));
        //7.indexOf, the index of the first appearance of a certain value, return -1 if it doesn't exist
        int index = list.indexOf("fire");
        System.out.println(index);
    }
}
