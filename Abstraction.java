package Oops;
// In Java, Data Abstraction is the property by virtue of which only the essential details are displayed to the user.
//  The trivial or the non-essential units are not displayed to the user. 

// Ex: A car is viewed as a car rather than its individual components.

// What is Abstraction in Java?
// In Java, abstraction is achieved by interfaces and abstract classes. We can achieve 100% abstraction using interfaces.
// An abstract class is a class that is declared with an abstract keyword.

// An abstract method is a method that is declared without implementation.
// An abstract class may or may not have all abstract methods. Some of them can be concrete methods
// A method-defined abstract must always be redefined in the subclass, thus making overriding compulsory or making the subclass itself abstract.
// Any class that contains one or more abstract methods must also be declared with an abstract keyword.
// There can be no object of an abstract class. That is, an abstract class can not be directly instantiated with the new operator.
// An abstract class can have parameterized constructors and the default constructor is always present in an abstract class.

// Java program to illustrate the
// concept of Abstraction
abstract class Shape {
	String color;

	// these are abstract methods
	abstract double area();
	public abstract String toString();

	// abstract class can have the constructor
	public Shape(String color)
	{
		System.out.println("Shape constructor called");
		this.color = color;
	}

	// this is a concrete method
	public String getColor() { return color; }
}
class Circle extends Shape {
	double radius;

	public Circle(String color, double radius)
	{

		// calling Shape constructor
		super(color);
		System.out.println("Circle constructor called");
		this.radius = radius;
	}

	@Override double area()
	{
		return Math.PI * Math.pow(radius, 2);
	}

	@Override public String toString()
	{
		return "Circle color is " + super.getColor()
			+ "and area is : " + area();
	}
}
class Rectangle extends Shape {

	double length;
	double width;

	public Rectangle(String color, double length,
					double width)
	{
		// calling Shape constructor
		super(color);
		System.out.println("Rectangle constructor called");
		this.length = length;
		this.width = width;
	}

	@Override double area() { return length * width; }

	@Override public String toString()
	{
		return "Rectangle color is " + super.getColor()
			+ "and area is : " + area();
	}
}
public class Abstraction {
	public static void main(String[] args)
	{
		Shape s1 = new Circle("Red", 2.2);
		Shape s2 = new Rectangle("Yellow", 2, 4);

		System.out.println(s1.toString());
		System.out.println(s2.toString());
	}
}
