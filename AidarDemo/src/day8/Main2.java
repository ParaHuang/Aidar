package day8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(3);
        list.add(32);
        list.add(89);
        list.add(3);
        list.add(32);
        System.out.println(list.size());
        System.out.println(list);

        //set:
        //1.no duplicate
        //2.no index
        Set<Integer> set = new HashSet<>();
        set.add(11);
        set.add(3);
        set.add(32);
        set.add(89);
        set.add(3);
        set.add(32);
        System.out.println(set.size());
        System.out.println(set);

        for(int e:set){
            System.out.println(e);
        }

        //contains
        System.out.println(set.contains(111));
        set.remove(11);
        System.out.println(set);
    }
}
