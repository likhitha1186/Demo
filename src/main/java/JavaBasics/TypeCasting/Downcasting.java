package JavaBasics.TypeCasting;

public class Downcasting {
    public static void main(String[] args) {
        double dvalue = 125.52552145214;
        float fvalue = (float) dvalue;
        System.out.println(fvalue);

        long lvalue = 1253624545;
        int ivalue = (int) lvalue;
        System.out.println(ivalue);
    }
}
