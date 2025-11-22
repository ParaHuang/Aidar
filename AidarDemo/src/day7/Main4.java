package day7;

import java.util.ArrayList;
import java.util.List;

public class Main4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(23);

//        list.remove(0);       //by index
        list.remove((Integer) 23);
        System.out.println(list);
        /*
                primitive type              Wrapper class(Reference type)
                    short                       Short
                    int                         Integer
                    long                        Long
                    float                       Float
                    double                      Double
                    char                        Character
                    boolean                     Boolean
                    byte                        Byte
         */
    }
}
