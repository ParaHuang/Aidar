package day8;

public class Main1 {

	public static void main(String[] args) {
//		int[] ary = {11,22,33,44};
		//2D-array:  the array of array
//		int[]	: the array of int
//		String[]: the array of String
		
		int[][] ary = {
				{11},					//row:0
				{21,22,23,24},			//1
				{31,32,33},				//2
				{41,42,43,44,45},		//3
				{51,52}					//4
		};//	 0  1   2 3  4 ->column
		
		
		//ary[rowIndex]					-- operating the 1D array
		//ary[rowIndex][columnIndex]	-- operating element
		for(int i=0 ; i<ary.length ; i++){
			for(int j=0 ; j<ary[i].length ; j++){	//operating the specific 1D array one by one
				System.out.print(ary[i][j]+"\t");
			}
			System.out.println();
		}
		
		
//		System.out.println(ary[0][0]);
//		System.out.println(ary[0][1]);
//		System.out.println(ary[0][2]);
//		
//		System.out.println(ary[1][0]);
//		System.out.println(ary[1][1]);
//		System.out.println(ary[1][2]);
//		
//	
//		System.out.println(ary[2][0]);
//		System.out.println(ary[2][1]);
//		System.out.println(ary[2][2]);
//
//		System.out.println(ary[3][0]);
//		System.out.println(ary[3][1]);
//		System.out.println(ary[3][2]);
		
	}

}

