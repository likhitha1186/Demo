package JavaBasics;

class Add{
    int a=10, b=20;
    void sum(){
        System.out.println(a+b);
    }

    void sum(int x, int y){
        System.out.println(x+y);
    }
    void sum(int x, int y, int z){
        System.out.println(x+y+z);
    }
    void sum(double x, int y){
        System.out.println(x+y);
    }
}
public class Polymorphism {
    public static void main(String[] args) {
         Add add=new Add();
         add.sum();
         add.sum(2,5);
         add.sum(3.5,5);
         add.sum(2,8,12);

    }
}
