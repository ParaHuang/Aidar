package day9;

import java.util.*;
//Collection    ->      container
//Collections   ->      a tool for up to use Collection
public class Test3 {
    public static void main(String[] args) {
//        1.You are organizing a small party, which is only allowed 5 people to attend,but 10 people signed for this party, they are:
//        Jhon, Jack, Alex, Helan, Cecilia, Mia,So nia, Tomas, Tyler, Chris.
//        Now you need to choose 5 of them randomly to attend your party.
//        Try to create a program to make it come true, in the end, output your guests' name one by one.
        //uneditable list
        List list = Arrays.asList("Jhon", "Jack", "Alex", "Helan", "Cecilia", "Mia","Sonia", "Tomas", "Tyler", "Chris");

        //mess up with this list
        Collections.shuffle(list);
        System.out.println(list);
        for(int i=0 ; i<5 ; i++){
            System.out.println(list.get(i));
        }
    }
}
