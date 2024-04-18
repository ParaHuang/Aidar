package day14;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class Main4 {

	public static void main(String[] args) {
		//List   						Set
		//they both can save a lot of data
		//save duplicate data			can't save duplicates
//		1.You are organizing a small party, which is only allowed 5 people to attend,
//		but 10 people signed for this party, they are:
//		Jhon, Jack, Alex, Helan, Cecilia, Mia,Sonia, Tomas, Tyler, Chris.
//		Now you need to choose 5 of them randomly to attend your party.
//		Try to create a program to make it come true, in the end, output your guests' name one by one.
		//Arrays.asList()		--> generate a list by the element we put int ()
		//Collections.shuffle(list)	--> shuffle a list
		
		//not allowed to change the structure
		List<String> list = Arrays.asList("Jhon", "Jack", "Alex", "Helan", "Cecilia", "Mia","Sonia", "Tomas", "Tyler", "Chris");
//		list.add("aaa");
		Collections.shuffle(list);
		
		for(int i=0 ; i<5 ; i++) {
			System.out.println(list.get(i));
		}
		
		
	}

}










