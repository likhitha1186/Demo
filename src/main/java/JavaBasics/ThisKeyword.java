package JavaBasics;

public class ThisKeyword {
    int x,y;// class variables
    ThisKeyword(int x, int y){
        this.x=x;
        this.y=y;
    }
    void  setData(int a, int b){ //local variable
        x=a;
        y=b;
    }
    void display(){
        System.out.println(x);
        System.out.println(y);
    }

    public static void main(String[] args) {
        ThisKeyword th=new ThisKeyword(100,200);
        System.out.println(th.x);
        System.out.println(th.y);
        th.setData(10,20);
        th.display();
    }
}
