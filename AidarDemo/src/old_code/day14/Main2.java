package old_code.day14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main2 {

	public static void main(String[] args) {
//		1.You are organizing a small party, which is only allowed 5 people to attend,
//		but 10 people signed for this party, they are:
//		Jhon, Jack, Alex, Helan, Cecilia, Mia,Sonia, Tomas, Tyler, Chris.
//		Now you need to choose 5 of them randomly to attend your party.
//		Try to create a program to make it come true, in the end, output your guests' name one by one.
		String[] ary = {"Jhon", "Jack", "Alex", "Helan", "Cecilia", "Mia","Sonia", "Tomas", "Tyler", "Chris"};
		ArrayList<String> list = new ArrayList<String>();
		for(String x:ary) {
			list.add(x);
		}
		
		
		Random random = new Random();
		for(int i =0 ; i<5 ; i++) {//run for 5 times
			int index = random.nextInt(list.size());
			list.remove(index);
		}
		System.out.println(list);
	
	}

}

