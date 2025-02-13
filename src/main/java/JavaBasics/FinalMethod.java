package JavaBasics;

class Test1 {

    void m(){
        System.out.println("This is m method from Test1");
    }
   final void m1() { //final method
        System.out.println("this is m method from Test1");
    }
}

class Test2 extends Test1 {
    void m() {
        System.out.println("This is m method from Test2");
    }
}

public class FinalMethod {

    public static void main(String[] args) {
        Test2 t2 = new Test2();
        t2.m1();
       t2.m();
    }
}
