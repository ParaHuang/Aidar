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
}
