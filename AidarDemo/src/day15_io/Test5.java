package day15_io;

public class Test5 {
    public static void main(String[] args) {
        //lambda: a style of coding for FunctionInterface->anonymous method
        //for a method, 2 important things :1.parameters  2.what to do
        /*
                (param1,param2,param3)->{
                    code block
                }
         */
        /*MyFunctionInterface mfi = new MyFunctionInterface() {
            @Override
            public void a() {
                System.out.println("the code of MyFunctionInterface----");
            }
        };
        mfi.a();*/

        MyFunctionInterface mfi = () -> {
            System.out.println("the code of MyFunctionInterface----");
        };
        mfi.a();
        //1.omit the type of paramters
        MyFunctionInterface2 mfi2_1 = (x, y) -> {
            System.out.println("------2-1-------");
        };
        //2.if there is only 1 code for method body, then you can omit {}
        MyFunctionInterface2 mfi2_2 = (x, y) -> System.out.println("------2-2-------");
        //3.if there is only 1 code for method body,and that code is return, you can even omit return
        MyFunctionInterface3 mfi3_1 = (x, y) -> x+y;
        MyFunctionInterface3 mfi3_2 = new MyFunctionInterface3() {
            @Override
            public int a(int x, int y) {
                return x+y;
            }
        };
        System.out.println(mfi3_1.a(10,2));
        System.out.println(mfi3_2.a(10,2));
        //4.if there is only 1 parameter, then you can omit ()
        MyFunctionInterface4 mfi4_1 = x-> System.out.println(x);
        mfi4_1.a(89);

        //ternary operation
        System.out.println(1<5?"hello":"hey");
//        if(1<5){
//            a lot of code
//        }else{
//            a lot of code
//        }
    }
}

//interface:all methods are abstract
//      |--------FunctionalInterface:there is only 1 method
interface NormalInterface {
    void a();

    void b();

    void c();
}

@FunctionalInterface
interface MyFunctionInterface {
    void a();
}

interface MyFunctionInterface2 {
    void a(int x, int y);
}

interface MyFunctionInterface3 {
    int a(int x, int y);
}

interface MyFunctionInterface4 {
    void a(int x);
}