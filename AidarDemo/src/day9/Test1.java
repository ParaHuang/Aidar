package day9;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test1 {
    public static void main(String[] args) {
//        1.You are organizing a small party, which is only allowed 5 people to attend,but 10 people signed for this party, they are:
//        Jhon, Jack, Alex, Helan, Cecilia, Mia,So nia, Tomas, Tyler, Chris.
//        Now you need to choose 5 of them randomly to attend your party.
//        Try to create a program to make it come true, in the end, output your guests' name one by one.
        String[] names = {"Jhon", "Jack", "Alex", "Helan", "Cecilia", "Mia","Sonia", "Tomas", "Tyler", "Chris"};
        List<String> list = new ArrayList<>();
        for(int i=0 ; i< names.length ; i++){
            list.add(names[i]);
        }
        System.out.println(list);
        Random random = new Random();
        for(int i=1 ; i<=5 ; i++){
            //select people
            int index = random.nextInt(list.size());
            String name = list.remove(index);
            System.out.println(index+":"+name+" just went to party");
            System.out.println("now the list is:"+list);
            System.out.println();
        }
    }
}
