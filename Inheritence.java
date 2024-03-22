package Oops;
// Java, Inheritance is an important pillar of OOP(Object-Oriented Programming). It is the mechanism in Java by which one class is allowed to inherit the features(fields and methods) of another class. In Java, Inheritance means creating new classes based on existing ones. A class that inherits from another class can reuse the methods and fields of that class. In addition, you can add new fields and methods to your current class as well.  

// Why Do We Need Java Inheritance?
// Code Reusability: The code written in the Superclass is common to all subclasses. Child classes can directly use the parent class code.
// Method Overriding: Method Overriding is achievable only through Inheritance. It is one of the ways by which Java achieves Run Time Polymorphism.
// // Abstraction: The concept of abstract where we do not have to provide all details is achieved through inheritance. Abstraction only shows the functionality to the user.

// Syntax : 

// class derived-class extends base-class  
// {  
//    //methods and fields  
// // }  
// Single Inheritance
// Multilevel Inheritance
// Hierarchical Inheritance
// Multiple Inheritance
// Hybrid Inheritance
class one {
    public void print_geek()
    {
        System.out.println("Geeks");
    }
}
  
class two extends one {
    public void print_for() { System.out.println("for"); }
}
 
public class Inheritence {
    
      public static void main(String[] args)
    {
     two g = new two();
        g.print_geek();
        g.print_for();
        g.print_geek();
}
}
