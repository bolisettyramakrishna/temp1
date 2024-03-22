package Oops;
 class Parent{

    String name;
    int age;
    int roll=101;
    Parent(){
        System.out.println("This is parent class");
    }

    void method(){
        System.out.println("this is sample method");
    }
} 

public class ObjectDemo {
    public static void main(String []args){

        Parent parentObj= new Parent();
        parentObj.method();
        parentObj.name="rama";
        parentObj.age=20;


    }
}
