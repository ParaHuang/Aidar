package old_code.day15;

import java.util.HashMap;
import java.util.Set;

public class Main2 {

	public static void main(String[] args) {
		//Java is awesome!
		//calculate the times of every letter shows up in this sentence
		
		
		String str = "Java is awesome";
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		char[] ary = str.toCharArray();//->['J','a','v','a',' ','i',....]
		//1.check letters one by one -> for
		for(char c:ary) {
			Integer count = map.get(c);
			//2.see if this letter exist before
			if(count==null) {
				// no:  make count as 1
				map.put(c, 1);
			}else {
				// yes:  make count +1
				count++;
				map.put(c, count);//replace the old vaule with new value
			}
		}
		
		System.out.println(map);
		//get all the key,save them in a Set
		Set<Character> set = map.keySet();
		for(char key:set) {
			System.out.println(key+" showed "+map.get(key) +" times in this sentence");
		}
		//J		1
		//a		2
		//v		1
		//
		
		/*
		        Collection										Map
		        	|											|
		      -----------------------							HashMap
		      |						|							TreeMap
		      List					Set							LinkedHashMap
		      |						|
		      ArrayList				HashSet
		      LinkedList			TreeSet
		      Vector  				LinkedHashSet
		 */
	}

}
















