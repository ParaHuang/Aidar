package day11_exception;

import java.util.Scanner;

//compile exception:the exception happens when you are writing the code
//                  usually those kind of code are important and easy to be wrong
//runtime exception:the exception might happen when you are running the program
public class Test4 {
    public static void main(String[] args) {
        System.out.println("begin");
        try {
            //this String parameter has to be a full path of a class
            Class.forName("java.util.Scanner");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("end");
    }
}
