package JavaBasics;

public class StaticKeyword {
    static int a=10; // static variable
    int b=20; // Non-static variable

    static void a1(){  // static method
        System.out.println("its a static method");

    }

    void a2(){  //Non-static method
        System.out.println("Not static method");
        a1();
    }


    public static void main(String[] args) {
         System.out.println(a);
         a1();
         StaticKeyword sk=new StaticKeyword();
         System.out.println(sk.b);
         sk.a2();
    }
}
