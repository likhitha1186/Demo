package JavaBasics;

 class AreaOfCircle{
     private int radius;
     public void area(int r){
         System.out.println("Area of Circle is " + r);
     }
     public int setRadius(int r){
         radius=r;
         return r;
     }
     public int getRadius(){
         return radius;
     }
 }
public class Encapsulation {
    public static void main(String[] args) {
        AreaOfCircle aoc=new AreaOfCircle();
        int l=aoc.setRadius(10);
        aoc.area(l);
        System.out.println(aoc.getRadius());
    }
}
