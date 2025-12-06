package day11_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        System.out.println("------------start");
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("please input 2 integer numbers:");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = a / b;
            System.out.println(c);
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            //when someone need be executed in the end no matter if there is exception or not
            //usually we can release some resource here
            System.out.println("the code will be executed ----");
        }

        System.out.println("------------end");
    }
}
