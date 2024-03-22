package Oops;

import java.lang.reflect.Method;

class Add{

int add(int a, int b){
        return a+b;
    }
 int add(int a,int b,int c){
        return a+b+c;

    }
    int add(int a,double b){
        return a+(int)b;
    }

}
class Par{
    
    void parentMethod(){
        System.out.println("this is parentMethod");
    }
}
class Child extends Par{
    void parentMethod(){
        System.out.println("This is chuld method");
    }
    
}
public class Polymorphism {
    //  compile time -> funciton overlaoding
    //  run time -> funciton overriding
    // The access modifier for an overriding method can allow more, but not less, access than the overridden method.
    //  For example, a protected instance method in the superclass can be made public, but not private, in the subclass.
    //   Doing so will generate a compile-time error. 
    // 2. Final methods can not be overridden
    // 3. Static methods can not be overridden(Method Overriding vs Method Hiding): 
    // 4. Private methods can not be overridden
    // 5. The overriding method must have the same return type (or subtype)

//     Overriding vs Overloading
// 1. Overloading is about the same method having different signatures. 
// Overriding is about the same method, and same signature but different classes connected through inheritance. 

    public static void main(String [] args){
        Add addObj=new Add();
        System.out.println(addObj.add(1,2));
         System.out.println(addObj.add(1,2,3));
          System.out.println(addObj.add(1,5.5));

          Par childObj=new Child();
            childObj.parentMethod();
        // Child parObj=new Par(); Its not possible 


    }
}
