package JavaBasics.WrapperClass;

public class PrimitiveToString {
    public static void main(String[] args) {
        //int,double,boolean,char -> String
        int i=10;
        double d=12.5;
        char c='c';
        boolean b=true;

        System.out.println( String.valueOf(i));
        System.out.println( String.valueOf(d));
        System.out.println( String.valueOf(c));
        System.out.println(  String.valueOf(b));


    }
}
