package JavaBasics.InheritanceTypes;

class H1{
    int a=10;
    void print(){
        System.out.println(a);
    }
}

class H2 extends H1{
    int b=200;

    void display(){
        System.out.println(b);
    }
}

class  H3 extends H1{
    int c=20;
    void show(){
        System.out.println(c);
    }
}

public class Hierarchical {
    public static void main(String[] args) {
    H2 h2= new H2();
    h2.display();
    H3 h3=new H3();
    h3.show();
    h3.print();
    }
}
