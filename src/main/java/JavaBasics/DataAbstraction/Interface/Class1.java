package JavaBasics.DataAbstraction.Interface;

public class Class1 extends Class2 implements Interface1, Interface2{

    public void m1(){
        System.out.println(A);
    }

    public void m2(){
        System.out.println(B);
    }

    public static void main(String[] args) {
           Class1 c1= new Class1();
           c1.m1();
           c1.m2();
           System.out.println(c1.A);
           System.out.println(c1.B);
           c1.m3();
           System.out.println(c1.C);
    }
}
