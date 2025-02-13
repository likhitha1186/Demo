package JavaBasics;

class bank{
    double roi(){ //declaration
        return 0; //implementation/body of the method
    }
}
class KAR extends bank{
 double roi(){
     return 10.5;
 }
}

class SBI extends bank{
    double roi(){
        return 15.5;
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
         KAR kar=new KAR();
         System.out.println(kar.roi());

         SBI sbi=new SBI();
         System.out.println(sbi.roi());

    }

}
