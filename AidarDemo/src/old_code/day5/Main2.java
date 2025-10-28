package old_code.day5;

public class Main2 {

	public static void main(String[] args) {
		//1.define an array,and declared the length of this array
		//type[] aryName = new type[length];
		
		//define an array , which can save 7 integer numbers
		int[] ary = new int[6];
		ary[0] = 23;
		ary[1] = 66;
		ary[2] = 88;
		ary[3] = 1;
		ary[4] = 8;
		ary[5] = 77;	
		
//		System.out.println(ary[0]);//the first element of array
//		System.out.println(ary[1]);
//		System.out.println(ary[2]);
//		System.out.println(ary[3]);
//		System.out.println(ary[4]);
//		System.out.println(ary[5]);
		
		
		//loop:repeating same or similar stuffs
		for(int i=0 ; i<ary.length ; i++){//0~5
			System.out.println(ary[i]);
		}
		
	}

}










