package JavaBasics.InheritanceTypes;

class M1 {
    int a = 100;

    void display() {
        System.out.println(a);
    }
}

class M2 extends M1 {
    int b = 200;

    void show() {
        System.out.println(b);
//        System.out.println(a);
    }
}

class M3 extends M2 {
    int c = 400;

    void displays() {
        System.out.println(c);
//        System.out.println(b);
//        System.out.println(a);

    }
}

public class Multilevel {
    public static void main(String[] args) {
        M3 m3 = new M3();
        m3.displays();
        m3.display();
        m3.show();
    }
}
