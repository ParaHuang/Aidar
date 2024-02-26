package day3;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//5 rows, 5 columns
		for(int i=1 ; i<=8 ; i++){		//outside loop:control rows
			for(int j=1 ;j<=8; j++){	//inner loop:control columns
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=1 ; i<=15 ; i++){		//outside loop:control rows --i:i-th row
			for(int j=1 ;j<=i; j++){	//inner loop:control columns
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		/*
		 
		 *****
		 ****
		 ***
		 **
		 *
		 
		 */
		
		
		for(int i=5 ; i>=1 ; i--){		//outside loop:control rows --i:i-th row
			for(int j=1 ;j<=i; j++){	//inner loop:control columns
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		//loop of N times 
		
//		      A        B      C
//		for(int i=1 ; i<=N ; i++) {
//			D
//		}
//		A:initial value
//		B:condition
//		C:increment
//		D:operations
//		A->B->D->C->B->D->C->B->D->C->B(false)->end
		
		/*
		 					i:row		k:space		j:diamond
		    *				1			4			1
		   ***				2			3			3
		  *****				3			2			5
		 *******			4			1			7
		*********			5			0			9
							i			k=5-i		j=i+(i-1)
		*/					
		
		//change how many rows
		int rows = 19;
		for(int i=1 ; i<=rows ; i++) {
			//print space
			for(int k=1 ; k<=rows-i ; k++) {
				System.out.print(" ");
			}
			//print diamonds
			for(int j=1 ; j<=i+i-1 ; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		// 2.do the last one upside down
		// 3.chess     W:white   B:black
		/*
		WBWBWBWB
		BWBWBWBW
		WBWBWBWB
		BWBWBWBW
		WBWBWBWB
		BWBWBWBW
		WBWBWBWB
		BWBWBWBW
		*/
		System.out.println("WBWBWBWB");
		System.out.println("BWBWBWBW");
		System.out.println("WBWBWBWB");
		System.out.println("BWBWBWBW");
		System.out.println("WBWBWBWB");
		System.out.println("BWBWBWBW");
		System.out.println("WBWBWBWB");
		System.out.println("BWBWBWBW");
		
		System.out.print("B");
		System.out.print("W");
	}

}














