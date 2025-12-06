package day11_exception;

import java.util.Scanner;

//compile exception:
//runtime exception:the exception happens when you are running the program
public class Test3 {
    public static void main(String[] args) {
        System.out.println("please input 2 integer numbers:");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if(b == 0){
            System.out.println("the second number can't be 0");
        }else {
            int c = a / b;
            System.out.println(c);
        }

        System.out.println("end");
    }
}
