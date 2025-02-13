package JavaBasics.InheritanceTypes;
class A{
    int a=100;
    void  display(){
        System.out.println(a);
    }
}
class B extends A{
    int b=200;
    void show(){
        System.out.println(b);
        System.out.println(a);
    }
}

public class SingleLevel {

    public static void main(String[] args) {
        B b=new B();
        System.out.println(b.a);
        b.display();
        b.show();
    }
}
