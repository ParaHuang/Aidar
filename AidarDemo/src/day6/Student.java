package day6;

public class Student {
    private int id;
    private String name;
    private int age;
    public static String teacherName;  //static variable is shared by every object of this class
    //when filed has modifier of static, then it's upgraded,now it doesn't belong to object, it belongs to class
    //static variable can be visited by ClassName.variableName
    public static int count;  //shared by all object

    public Student(int id, String name, int age, String teacherName) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.teacherName = teacherName;
        count++;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ",name='" + name + '\'' +
                ",age=" + age +
                ", teacherName='" + teacherName + '\'' +
                '}';
    }

    public void a(){//belongs to object

    }

    public static void b(){ //->belong to class
//      a();    //wrong
      c();

//      id = 10;//wrong
        count = 10;
    }
    public static void c(){

    }
}
//static
//1.use on variable
//      a.static variable belongs to class,every object share it
//      b.use it by ClassName.variableName
//2.use on method:
//      a.static method will be preloaded when you just define the class
//      b.static method can only directly use other static method or variable
//      c.static method belongs to class, in other place you can call it by ClassName.methodName();