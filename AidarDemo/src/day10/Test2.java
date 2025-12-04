package day10;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test2 {
    public static void main(String[] args) {
        //values with different description
        //map   ->          key-value
        //              description-value
        Map<String,Object> map = new HashMap<>();

        //add value with key
        map.put("height",1.67);
        map.put("name","Lily");
        map.put("age",18);
        map.put("gender","female");
        map.put("age",20);
        //unique key

        System.out.println(map);
        System.out.println(map.get("age"));
        System.out.println("name is "+map.get("name"));
        System.out.println("age is "+map.get("age"));
        System.out.println("gender is "+map.get("gender"));
        System.out.println("height is "+map.get("height"));
        System.out.println("nationality is "+map.get("nationality"));
        //null
        int age;
        age = 18;
        age = 20;

        //see if map contains a certain key
        System.out.println(map.containsKey("age"));
        System.out.println();
        //get all the keys, save them in a Set
        Set<String> keys = map.keySet();
        for(String k:keys){
            System.out.println(k+"--"+map.get(k));
        }
    }
}
