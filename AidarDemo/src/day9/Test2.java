package day9;

import java.util.*;

public class Test2 {
    public static void main(String[] args) {
//        1.You are organizing a small party, which is only allowed 5 people to attend,but 10 people signed for this party, they are:
//        Jhon, Jack, Alex, Helan, Cecilia, Mia,So nia, Tomas, Tyler, Chris.
//        Now you need to choose 5 of them randomly to attend your party.
//        Try to create a program to make it come true, in the end, output your guests' name one by one.
        String[] names = {"Jhon", "Jack", "Alex", "Helan", "Cecilia", "Mia","Sonia", "Tomas", "Tyler", "Chris"};
        Set<String> set = new HashSet<>();      //use set to save the people who go to party

        Random random = new Random();
        while(set.size()<5){
            int index = random.nextInt(names.length);   //3   5   3  3   3
            set.add(names[index]);
            System.out.println(index+"--"+names[index]);
        }
        System.out.println("people who go to the party:"+set);
    }
}
