package day1_encapsulation;

//OOP:object-oriented programing
//encapsulation:to keep your code/information safe(make fields private, access privates fields by public function)
//          define fields->generate 2 constructors->generate getters and setters->generate toString
//inheritance:to reuse your code
//porlimorphism:to make code flexible
public class Student {//template to save those object's information,define their behavior
    //information to save:  number,name,age,gender  ->  fields,instances variable
    private int number;
    private String name;
    private int age;
    private String gender;

    //constructor
    //1.a special function,represent a process of creating an object
    //2.it doesn't have the concept of return type, it's in same name as class,we call it by new
    //3.in the begining, every class has an invisible constructor,
    //      public ClassName(){}
    //once you start write your own constructor, then invisible one disappear
    //4.usually we would initialize data in constructor
    //5.by function overloading, we can have more ways to create object
    public Student(int number,String name,int age,String gender){
        System.out.println("creating a student");
        this.number = number;
        this.name = name;
//        this.age = age;
        setAge(age);
//        this.gender = gender;
        setGender(gender);
    }

    public Student(int number,String name,String gender){
        this.number = number;
        this.name = name;
        setGender(gender);
    }
    public Student(){

    }

    public void setAge(int age) {
        //checking process
        if(age<1 || age>100){
            throw new RuntimeException("invalid age, "+age + " is not in the range of 1 to 100");
        }
        this.age = age;
    }


    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public void setName(String name) {
        //this:current object
        this.name = name;
    }


    public void setGender(String gender) {
        //checking process
        if(gender==null){
            return;
        }
        if(!"male".equals(gender) && !"female".equals(gender)){
            throw new RuntimeException("invalid gender, "+gender + " is neither male nor female");
        }
        this.gender = gender;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    //what they can do: study,sleep,take exam       ->  function
    public void study(){
        System.out.println("hey,"+name+",time to study");
    }
    public void sleep(){
        System.out.println("time to sleep as a "+age+" years old student");
    }

    //function overloading:functions are in the same name, but with different parameters (different amount,type,order)
    public void test(){

    }
    public void test(int x,String y){

    }
    public void test(String x,int y){

    }

    //get the String format of object.it's called automatically when you print the object
    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", number=" + number +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
    //override:in Subclass, overwrite the function from Superclass
}
//object->class