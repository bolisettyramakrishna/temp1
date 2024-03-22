package Oops;

// static  {
//     System.out.println("This is static block it is executed first");
//  but i dont know it is not woing here
// }
class StaticDemo{

    static String cpnyName;
    int  empId;
     StaticDemo(){
        System.out.println("constructor is caled");
    }

    static{
        //  staic block is called only once it is used to initialise static varibles 
        //  stativ block is called first than the constroctr
        cpnyName="apple";
    }
    public static void staticMethod(){
        System.out.println("Static methiod");
        //  accessing varibles in static method 
        //  In static method only we can use static vaiables 
        //  non statuc variabless cannot be used.
        System.out.println("cpnyname is "+cpnyName);
                        
        //  System.out.println("empID is "+empId); it doesnot works...
    } 

}

public class Static {
    
    public static void main(String []args){

        StaticDemo obj1=new StaticDemo();
        StaticDemo obj2=new StaticDemo();
        obj1.empId=1;
        obj2.empId=2;
        StaticDemo.cpnyName="Tcs";
        System.out.println("Obj1 cpnyname is "+obj1.cpnyName);
          System.out.println("Obj2 cpnyname is "+obj2.cpnyName);
        //   for static variables all objests share same memoru if one is changed all are changed.
        System.out.println("Using classs cpnyname "+StaticDemo.cpnyName);
        StaticDemo.cpnyName="Epam"; // we can also change using object obj1.cpyName="amazon";
         System.out.println(" after changeing Obj1 cpnyname is "+obj1.cpnyName);

        //  calling static method using class and obj
        obj1.staticMethod();
        StaticDemo.staticMethod();




    }
}
