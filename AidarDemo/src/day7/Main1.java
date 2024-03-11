package day7;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter month and day:");
		int month = scanner.nextInt();//11
		int day = scanner.nextInt();
		int sum = 0;
		//add from Jan until the month before this one//10
		for(int i=1 ; i<month ; i++) {
			if(i==1 || i==3 || i==5 || i==7 || i==8 || i==10 || i==12) {
				sum+=31;
			}else if(i==2) {
				sum+=28;
			}else {
				sum+=30;
			}
		}
		//add the day
		sum+=day;
		
		System.out.println(month+"-"+day+" is the "+sum+" days of this year");
	}

}
//1  2  3  4  5  6  7  8  9  10  11  12
//31 28 31 30 31 30 31 31 30 31  30  31

//3.enter 2 integer number to represent month part and day part of a date, 
//calculator how many days of a year is this date? 
//(ignore leap year, Feb has 28 days)
//sample 1:
//enter month:3
//enter day:14
//print: 3-14 is the 73 day of a year
//because 31+28+14 = 73
//
//sample 2:
//enter month:5
//enter day:1
//print: 5-1 is the 121 day of a year
//because 31+28+31+30+1=121
//
//sample 3:
//enter month:11
//enter day:18
//print: 11-18 is the ？？ day of a year
//because 31+28+31+30+31+30+31+31+30+31+18=？？







