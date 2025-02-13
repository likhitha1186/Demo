package JavaBasics;

import org.checkerframework.checker.units.qual.A;

class ABC{
    void m1(int a){
        System.out.println(a);
    }

    void m2(int b){
        System.out.println(b);
    }
}

class XYZ extends ABC{
    void m1(int a){ //overriding
        System.out.println(a*a);
    }

    void m2(int a, int b){   //overloading
        System.out.println(a+b);
    }
}


public class OverridingVsOverloading {
    public static void main(String[] args) {
       XYZ xyz= new XYZ();
       xyz.m1(2);
       xyz.m2(2,4);
       xyz.m2(5);
    }
}
