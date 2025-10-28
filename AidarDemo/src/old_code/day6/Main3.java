package old_code.day6;

public class Main3 {

	public static void main(String[] args) {
		int[] envelopes = {10,50,120,300,50,99,150,500,100,200};
		int max = envelopes[0];
		for(int i=1 ; i<envelopes.length ; i++) {
			if(max<envelopes[i]) {
				max = envelopes[i];
			}
		}
		System.out.println("the max envelope is:"+max);
		//Olympic diving competition
		//10 scores assigned by 10 judges
		//average = sum/10
		//final score = the average after you did (sum - max - min)
		//average = (sum-max-min)/8
		
	}

}

