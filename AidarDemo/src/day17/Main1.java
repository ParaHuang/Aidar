package day17;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows = 15;
        for(int i=1; i<=rows; i++){					//i=1	k=0		j=9=(5-1)*2+1
        	for(int k=1; k<=i-1; k++){				//i=2	k=1		j=7
                System.out.print(" ");				//i=3	k=2		j=5
            }

            for(int j=(rows-i)*2+1; j>=1; j--){
                System.out.print("*");
            }
            System.out.println();
        }
	}

}

