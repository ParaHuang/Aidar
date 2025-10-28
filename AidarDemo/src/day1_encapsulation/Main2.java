package day1_encapsulation;

public class Main2 {
    public static void main(String[] args) {
        //class->object
        //initialize:
        //ClassName reference = new ClassName();
        //1001,"Jack",18,"male"
        Student stu1 = new Student(1001,"Jack",18,"male");   //new->create
        //reference.filed      not useful anymore since all fields are private
        //reference.function();
/*
//        stu1.number = 1001;
        stu1.setNumber(1001);
//        stu1.name = "Jack";
        stu1.setName("Jack");
//        stu1.age = 1800;
        stu1.setAge(18);
//        stu1.gender = "male";
        stu1.setGender("male");
*/
        stu1.study();
        stu1.sleep();

//        System.out.println(stu1.name);
        System.out.println(stu1.getName());

        System.out.println("------------");
        //1002,Jo,19,male
        Student stu2 = new Student(1002,"Jo",19,"male");
//        stu2.name = "Jo";
//        stu2.age = -19;
        stu2.study();
        stu2.sleep();

//        stu2.test("hello");

        //1003,Lucy,??,female
        Student stu3 = new Student(1003,"Lucy","female");
        Student stu4 = new Student();
        Student stu5 = new Student(1002,"Jo",19,null);

        System.out.println(stu1);
        System.out.println(stu2);
        System.out.println(stu3);
        System.out.println(stu4.toString());
        System.out.println(stu5.toString());

    }
}
