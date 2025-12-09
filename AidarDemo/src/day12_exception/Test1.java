package day12_exception;

public class Test1 {
    public static void main(String[] args) {
        /*
        solve exception
        1.try...catch... (solve immediately)
        2.throws(not solve immediately ,but declare that there is an exception
            whenever we can this method, then we are forced to solve this exception)
         */

        try {
            //don't throws anymore when it's in main method
            test();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();    //print the exception
        }
        System.out.println("the end-----");
    }

    public static void test() throws ClassNotFoundException {
//        try {
            Class.forName("java.til.Scanner");
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }
    }
}
