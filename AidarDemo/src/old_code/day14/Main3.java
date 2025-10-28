package old_code.day14;

import java.util.HashSet;
import java.util.Random;

public class Main3 {

	public static void main(String[] args) {
		//List   						Set
		//they both can save a lot of data
		//save duplicate data			can't save duplicates
//		1.You are organizing a small party, which is only allowed 5 people to attend,
//		but 10 people signed for this party, they are:
//		Jhon, Jack, Alex, Helan, Cecilia, Mia,Sonia, Tomas, Tyler, Chris.
//		Now you need to choose 5 of them randomly to attend your party.
//		Try to create a program to make it come true, in the end, output your guests' name one by one.
		String[] ary = {"Jhon", "Jack", "Alex", "Helan", "Cecilia", "Mia","Sonia", "Tomas", "Tyler", "Chris"};
		HashSet<String> set = new HashSet<String>();
		Random random = new Random();
		while(set.size()<5) {
			int index = random.nextInt(10);
			String name = ary[index];
			System.out.println(name);
			set.add(name);
		}
		System.out.println(set);
		
	}

}










