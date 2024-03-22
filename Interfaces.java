package Oops;

// An Interface in Java programming language is defined as an abstract type used to specify the behavior of a class.
//  An interface in Java is a blueprint of a behaviour. A Java interface contains static constants and abstract methods.

// The interface in Java is a mechanism to achieve abstraction. There can be only abstract methods in the Java interface, 
// not the method body. It is used to achieve abstraction and multiple inheritance in Java. In other words, you can say that interfaces
//  can have abstract methods and variables. It cannot have a method body. Java Interface also represents the IS-A relationship.

// Interfaces specify what a class must do and not how. It is the blueprint of the behaviour.
// Interface do not have constructor. 
// Represent behaviour as interface unless every sub-type of the class is guarantee to have that behaviour. 
// An Interface is about capabilities like a Player may be an interface and any class implementing Player must be able to (or must implement) move(). So it specifies a set of methods that the class has to implement.
// If a class implements an interface and does not provide method bodies for all functions specified in the interface, then the class must be declared abstract.
// A Java library example is Comparator Interface. If a class implements this interface, then it can be used to sort a collection.

// To declare an interface, use the interface keyword. It is used to provide total abstraction. 
// That means all the methods in an interface are declared with an empty body and are public and all fields are public, static, 
// and final by default. A class that implements an interface must implement all the methods declared in the interface.
//  To implement interface use implements keyword.
// Java program to demonstrate the
// real-world example of Interfaces

// In Java, all methods in an interface are public even if we do not specify public with method names.
//  Also, data fields are public static final even if we do not mention it with fields names. 
//  Therefore, data fields must be initialized.

// Consider the following example, x is by default public static final and foo() 
// is public even if there are no specifiers.
// interface Test {
// int x = 10; // x is public static final and must be initialized here
// void foo(); // foo() is public
// }


interface Vehicle {
	
	// all are the abstract methods.
	void changeGear(int a);
	void speedUp(int a);
	void applyBrakes(int a);
}

class Bicycle implements Vehicle{
	
	int speed;
	int gear;
	
	// to change gear
	@Override
	public void changeGear(int newGear){
		
		gear = newGear;
	}
	
	// to increase speed
	@Override
	public void speedUp(int increment){
		
		speed = speed + increment;
	}
	
	// to decrease speed
	@Override
	public void applyBrakes(int decrement){
		
		speed = speed - decrement;
	}
	
	public void printStates() {
		System.out.println("speed: " + speed
			+ " gear: " + gear);
	}
}

class Bike implements Vehicle {
	
	int speed;
	int gear;
	
	// to change gear
	@Override
	public void changeGear(int newGear){
		
		gear = newGear;
	}
	
	// to increase speed
	@Override
	public void speedUp(int increment){
		
		speed = speed + increment;
	}
	
	// to decrease speed
	@Override
	public void applyBrakes(int decrement){
		
		speed = speed - decrement;
	}
	
	public void printStates() {
		System.out.println("speed: " + speed
			+ " gear: " + gear);
	}
	
}
public class Interfaces {
	
	public static void main (String[] args) {
	
		// creating an instance of Bicycle
		// doing some operations
		Bicycle bicycle = new Bicycle();
		bicycle.changeGear(2);
		bicycle.speedUp(3);
		bicycle.applyBrakes(1);
		
		System.out.println("Bicycle present state :");
		bicycle.printStates();
		
		// creating instance of the bike.
		Bike bike = new Bike();
		bike.changeGear(1);
		bike.speedUp(4);
		bike.applyBrakes(3);
		
		System.out.println("Bike present state :");
		bike.printStates();
	}
}

// New Features Added in Interfaces in JDK 8
// 1. Prior to JDK 8, the interface could not define the implementation. We can now add default implementation for interface methods. 
// This default implementation has a special use and does not affect the intention behind interfaces.

// Java program to show that interfaces can
// have methods from JDK 1.8 onwards

// interface In1
// {
// 	final int a = 10;
// 	default void display()
// 	{
// 		System.out.println("hello");
// 	}
// }

// // A class that implements the interface.
// class TestClass implements In1
// {
// 	// Driver Code
// 	public static void main (String[] args)
// 	{
// 		TestClass t = new TestClass();
// 		t.display();
// 	}
// }
