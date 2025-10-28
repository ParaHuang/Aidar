package old_code.day10;

//2.define a methods,which take 2 int number  and a String as parameters
//        as method body, print    xx ? xx = xx
//        ? is one of +, -, *, /, %
//        first two xx are the value for 2 int parameters , and ? is a operator which saved in that String parameter, the the last xx is the result of those number do the operation

//        sample 1:
//        call method:    methodName(4,6,"+")
//        print:   4+6=10

//        sample 2:
//        call method:    methodName(101,29,"-")
//        print:  101-29=72

//        sample 3:
//        call method:    methodName(33,3,"/")
//        print:  33/3=11

public class Exercise {
    public static void main(String[] args) {
        fun1(4, 6, " - ");
    }

    public static void fun1(int a, int b, String name) {
        int sum = 0;
        if(name.equals(" + ")){
            sum = a + b;
        }else if(name.equals(" - ")){
            sum = a - b;
        }else if(name.equals(" * ")){
            sum = a * b;
        }else if(name.equals(" / ")){
            sum = a / b;
        }else if(name.equals(" % ")){
            sum = a % b;
        }
        System.out.println(a + name + b + " = " + sum);
    }
}









