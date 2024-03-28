package day11;

public class Main1 {

	public static void main(String[] args) {
		int[] originalArr = {11,22,33,44,55,66};//index:0~5
		int newLength = 10;
		int[] newArr = copyArray(originalArr, newLength);//{11,22}
		for(int x:newArr) {
			System.out.println(x);
		}
	}
	
	public static int[] copyArray(int[] originalArr , int newLength) {
		//create a new array
		int[] newAry = new int[newLength];//7
//		int tempLength ;
//		if(newLength>originalArr.length) {
//			tempLength = originalArr.length;
//		}else{
//			tempLength = newLength;
//		}
		int tempLength = newLength>originalArr.length? originalArr.length:newLength;
		
		//use newLength when it's <= original length, 
		//use original length when newLength is bigger
		
		for(int i=0 ; i<tempLength ; i++) {//i:0~6
			newAry[i] = originalArr[i];
		}
		
		return newAry;
	}
	
	//here

}



//1.take 2 parameters , first one is a int array,represent the original array that you want to copy, second one is int parameter,represent the length for new array
//return int array
//public static int[] copyArray(int[] orgiginalArr , int newLength)
//this method will copy originalArr from first element into new array, and copy newLength(how many) of them
//sample 1:
//the originalArr is {11,22,33,44,55,66}
//newLength is: 2
//
//the new array you need to return is {11,22}
//sample 2:
//the originalArr is {11,22,33,44,55,66}
//newLength is: 8
//the new array you need to return is {11,22,33,44,55,66,0,0}





