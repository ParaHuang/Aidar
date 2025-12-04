package day10;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Test3 {
    public static void main(String[] args) {
//      use map to save different parts information of a whole object,or information with different descrption

//        Map<String,Object> map = new HashMap<>();           //no order
//        Map<String,Object> map = new TreeMap<>();           //natural order   . number<uppercase letter<lowercase letter
        Map<String,Object> map = new LinkedHashMap<>();       //adding order

        //add value with key
        map.put("height",1.67);
        map.put("name","Lily");
        map.put("age",18);
        map.put("gender","female");

        System.out.println(map);
    }
}
