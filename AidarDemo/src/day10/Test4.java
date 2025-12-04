package day10;
//1.solve it immediately by try...catch...
public class Test4 {
    public static void main(String[] args) {
        System.out.println("the beginning of program");
        try {
            int a = 10 / 0;
            System.out.println(a);
        }catch (ArithmeticException e){
            System.out.println("can't divide by 0");
        }

        System.out.println("the end of program");
        /*
        try{
            the code1 might cause exception
            the code2 might cause exception
            the code3
            the code4 might cause exception
        }catch(PossibleException1 ex1){
            solution1
        }catch(PossibleException2 ex2){
            solutions
        }

        the rest of program

         */

        /*
        the code1 might cause exception
        the code2 might cause exception
        the code3
        the code4 might cause exception

        the rest of program
         */
    }
}
