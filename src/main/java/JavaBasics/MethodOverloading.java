package JavaBasics;

class Addition{
    int a=10, b=20;
    void sum(){
        System.out.println(a+b);
    }

    void  sum(int x,int y){
        System.out.println(x+y);
    }

    void sum(int x, double y){
        System.out.println(x+y);
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
Addition add= new Addition();
add.sum();
add.sum(10,15);
add.sum(12,2.5);
    }
}
