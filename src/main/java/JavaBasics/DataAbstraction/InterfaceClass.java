package JavaBasics.DataAbstraction;

interface Shape {
    int length = 10;  //final & static
    int width = 20;    //final & static

    void circle(); //abstract method:unimplemented method

    /*
    void square(){
    //this is method is not possible bcz the interface does not contain body part.
     */
    default void square() {  //default method
        System.out.println("This is Square- Default method");
    }

    static void rectangle() {
        System.out.println("This is Rectangle- Static method");
    }
}

public class InterfaceClass implements Shape{
   public void circle(){
        System.out.println("This is Circle- Abstract method");
    }
    void triangle(){
       System.out.println("This is Triangle");
    }
    int x=100, y=200;
    public static void main(String[] args) {
        String name="john";
         InterfaceClass interfaceClass=new InterfaceClass(); // obj for the class & reference variable is also a class
         interfaceClass.circle();
         interfaceClass.square();
         interfaceClass.triangle(); // method it belongs to same class
         //rectangle(); bcz static method; error:static method is implemented in interface.
        Shape.rectangle(); //static method can directly access from interface.
        System.out.println(Shape2.length*Shape2.width); //accessing static variable directly
        System.out.println(name);
        System.out.println(interfaceClass.x*interfaceClass.y);
    }
}
