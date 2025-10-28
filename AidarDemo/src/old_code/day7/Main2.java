package old_code.day7;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] days = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter month and day:");
		int month = scanner.nextInt();//11
		int day = scanner.nextInt();
		int sum = 0;
		//add from Jan until the month before this one//10
		for(int i=1; i<month ; i++) {
			sum+=days[i];
		}
		//add the day
		sum+=day;
		
		System.out.println(month+"-"+day+" is the "+sum+" days of this year");
	}

}
//1  2  3  4  5  6  7  8  9  10  11  12
//31 28 31 30 31 30 31 31 30 31  30  31

//enter 3 integer number to represent year part, month part and day part of a date, 
//calculator how many days of a year is this date? 
//(consider leap year, Feb has 29 days in leap year)
//sample 1:
//enter year:2020
//enter month:3
//enter day:14
//print: 3-14 is the 74 day of a year
//because 31+29+14 = 73
//
//sample 2:
//enter year:2021
//enter month:5
//enter day:1
//print: 5-1 is the 121 day of a year
//because 31+28+31+30+1=121
//
//sample 3:
//enter year:2024
//enter month:11
//enter day:18
//print: 11-18 is the 323 day of a year
//because 31+29+31+30+31+30+31+31+30+31+18=323







