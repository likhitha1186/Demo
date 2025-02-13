package JavaBasics;

class Employee{
    String name="James";

    void salary(){
        System.out.println("Salary of "+ name  + " is 2500000");
    }
}

class Employee1 extends Employee{
    String name="John";

    void displayName(){
        System.out.println(name);
        System.out.println(super.name);
    }
    void salary(){
      System.out.println("Salary of " + name+ " is 500000");
      System.out.println("salary of " + super.name + " is 25000");
        super.salary();
    }
}

public class SuperMethod {
    public static void main(String[] args) {
      Employee1 emp=new Employee1();
      emp.displayName();
      emp.salary();
    }
}
