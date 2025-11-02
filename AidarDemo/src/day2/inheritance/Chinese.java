package day2.inheritance;

//class SubClass  extends  SuperClass{}
//SubClass/ChildClass
//SuperClass/ParentClass
public class Chinese extends Human{
    //override:SubClass overwrite the methods from SuperClass
    @Override
    public void eat() {
        //super: the object of SuperClass,which is the object of Human,Object
        //this: the object of current class,which is the object of Chinese
        super.eat();
        System.out.println("Chinese eat with chopsticks");
    }//why don't Chinese create a different method to solve eat

    public void kungFu(){
        System.out.println("Chinese know kungFu");
    }
}

//inheritance:
// 1.SubClass will inherit member from SuperClass
// 2.inheritance is 1 single way
// 3.inheritance chain is allowed
// 4.Object is the SuperClass of every class
// 5.if you don't want to reuse the code from SuperClass,
//    then override it

