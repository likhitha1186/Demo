package JavaBasics.Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.stream.StreamSupport;

public class HashSetDemo {
    public static void main(String[] args) {
        //Declaration
        HashSet myset = new HashSet();
/*
        Set myset1= new HashSet();
        HashSet<String> myset2= new HashSet<String>(); //homogeneous data

 */
        //Adding data into ArrayList
        myset.add(100);
        myset.add(200);
        myset.add(10.25);
        myset.add(null);
        myset.add("Likhitha");
        myset.add('l');
        myset.add(true);
        myset.add(100);
        myset.add(null);

        System.out.println("Size of an arraylist: "+myset.size()); //7
        System.out.println("Printing data from HashSet: "+myset); //  [null, 100, 10.25, Likhitha, 200, l, true]

        //Remove specific element from the Hashset
        myset.remove(null);
        System.out.println("After Removing: "+ myset);

        //Inserting elements- not possible

        //Access specific value from HashSet - not possible by direct method
        //Convert HashSet--->ArrayList
        ArrayList al= new ArrayList(myset);
        System.out.println(al);

        System.out.println(al.get(5));
        System.out.println("**********************");

        //Reading all the elements
        //1. using for loop -not possible
        //2. using for each loop
        for(Object x: myset){
            System.out.println(x);
        }
        System.out.println("***********************");
        //using Iterator method
        Iterator it= myset.iterator() ;
        while (it.hasNext()){
            System.out.println(it.next());
        }

        //Clearing all the elements in HashSet
        myset.clear();
        System.out.println("Is hashSet is empty?: "+ myset.isEmpty());
        System.out.println(myset);





    }
}
