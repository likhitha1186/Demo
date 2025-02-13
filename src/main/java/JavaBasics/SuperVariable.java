package JavaBasics;


 class Student{
     String name="John";
 }
 class  Student1 extends Student{
     String name="Smith";

     void printName(){
         System.out.println(name);
         System.out.println(super.name);//get the value from the parent calss
     }
 }
public class SuperVariable {
    public static void main(String[] args) {
        Student1 s1= new Student1();
        s1.printName();
    }
}
