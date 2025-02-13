package JavaBasics;

class A {
   static  void m() {
        System.out.println("this is m method from A");
    }
}

class B extends A {
    void m1() {
        System.out.println("this is m1 method from B ");
    }
}

final class C { //final class
  static   void m2() {
        System.out.println("this is m2 method from C");
    }
}

/*
class D extends C{
    void m3(){
        System.out.println("this is m3 method from D");
    }
}
*/
public class FinalClass {
    public static void main(String[] args) {
        B b = new B();
        b.m1();
        b.m();
        C c = new C();
        c.m2();

    }

}
