package day7;

public class Main1 {
    public static void main(String[] args) {
        int x = 10;
        x = 23;
        final int y = 5;
//        y = 10;

        System.out.println(Student.PI);
    }
}
//final
//1.with variable, it's a constant
//2.with method, this method is not allowed to override
//3.with class, this class can't be extends
class Student{
    public static final double PI = 3.14;

    public final void a(){}
    public void b(){}
}
class PrimarySchoolStudent extends Student {
    @Override
    public void b() {
        super.b();
    }

}
