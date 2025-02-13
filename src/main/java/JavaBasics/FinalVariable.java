package JavaBasics;

class Test {

    int y = 100;
    final int x = 10;

}

public class FinalVariable {
    public static void main(String[] args) {
        Test ts = new Test();
        System.out.println(ts.y);
        ts.y = 200;
        System.out.println(ts.y);
        //ts.x=200; incorrect bcz x is final variable.
        System.out.println(ts.x);
    }
}
