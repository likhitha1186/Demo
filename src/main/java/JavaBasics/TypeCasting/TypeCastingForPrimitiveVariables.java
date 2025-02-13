package JavaBasics.TypeCasting;

class Parent {
    String name = "smith";

    void m1() {
        System.out.println("This is m1 from Parent");
    }
}

class Child extends Parent {
    int id = 12;

    void m2() {
        System.out.println("this is m2 from Child");
    }
}

public class TypeCastingForPrimitiveVariables {
    public static void main(String[] args) {
        Child c = new Child();
        System.out.println(c.name);
        c.m1();
        System.out.println(c.id);
        c.m2();

        Parent p = new Child(); // parent class reference variable can hold child class object. Upcasting
        System.out.println(p.name); // we can access everything only from parent class
        p.m1();
        // System.out.println(p.id); we cannot access everything from child.

        Parent p1 = new Parent();
        Child c1 = (Child) p1;
        System.out.println(c1.name);
        System.out.println(c1.id);
        c1.m1();
        c1.m2();


    }
}
