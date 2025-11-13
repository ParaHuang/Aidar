package day6;

public class Main {
    public static void main(String[] args) {
        //2 students are in the same class
        Student stu1 = new Student(1001,"Jack",18,"Para");
        Student stu2 = new Student(1002,"Tom",19,"Para");

        System.out.println(stu1);
        System.out.println(stu2);

        stu1.setTeacherName("Yang");    //change the teacherName of stu1
        System.out.println();

        System.out.println(stu1);
        System.out.println(stu2);


        System.out.println("now there are "+ Student.count+" students together");
    }
}
