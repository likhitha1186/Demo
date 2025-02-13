package JavaBasics.DataAbstraction;

interface Shape2{
    int length = 10;  //final & static
    int width = 20;    //final & static

    void circle2(); //abstract method:unimplemented method

    /*
    void square(){
    //this is method is not possible bcz the interface does not contain body part.
     */
    default void square2() {  //default method
        System.out.println("This is Square- Default method");
    }

    static void rectangle2() {
        System.out.println("This is Rectangle- Static method");
    }
}

public class InterfaceClass2 implements Shape2{
    public void circle2(){
        System.out.println("This is Circle- Abstract method");
    }
    void triangle2(){
        System.out.println("This is Triangle");
    }
    int x=100, y=200;
    public static void main(String[] args) {
        String name="John";
      // Shape1 s1= new Shape1(); // we can not create the object for interface.
        Shape2 s2=new InterfaceClass2();// create object for class & store it in the interface. object of child class can hold into the variable of parent class.
        s2.circle2();
        s2.square2();
       // s2.triangle2(); bcz we are holding in interface variable but interface we don't have triangle method.
        Shape2.rectangle2();
        System.out.println(Shape2.length*Shape2.width); //accessing static variable directly
        System.out.println(name);
       // System.out.println(s2.x*s2.y); //we cannot access bcz x7&y belongs to class not interface.
    }
}
