package day11_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

//1.solve in the act by try...catch...
public class Test1 {
    public static void main(String[] args) {
        System.out.println("------------start");
        Scanner scanner = new Scanner(System.in);
        try {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
//            System.out.println("can't / by zero");
            e.printStackTrace();        //print the exception information
        } catch (InputMismatchException e){
            e.printStackTrace();
        }

        System.out.println("------------end");
    }
}
