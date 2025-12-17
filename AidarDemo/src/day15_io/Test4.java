package day15_io;

public class Test4 {
    public static void main(String[] args) {
        X x = new X();
        x.test1();
        x.test2();

        A a = new A(){

            @Override
            public void test1() {
                System.out.println("~~~~");
            }

            @Override
            public void test2() {
                System.out.println("``````");
            }
        };
        a.test1();
        a.test2();
    }
}

interface A{
    void test1();
    void test2();
}

class X implements A{

    @Override
    public void test1() {
        System.out.println("X---test1");
    }

    @Override
    public void test2() {
        System.out.println("X---test2");
    }
}
