package JavaBasics.Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        //declaration
        ArrayList mylist = new ArrayList(); //objects

       /*  List l1= new ArrayList(); //objects

        ArrayList <Integer> il=new ArrayList<Integer>();  predefined types-int
        ArrayList <Boolean>il1= new ArrayList<Boolean>(); predefines types-boolean

       */

        //Adding data into ArrayList
        mylist.add(100);
        mylist.add(200);
        mylist.add(10.25);
        mylist.add(null);
        mylist.add("Likhitha");
        mylist.add('l');
        mylist.add(true);
        mylist.add(100);
        mylist.add(null);

        //size of arrayList
        mylist.size();
        System.out.println("Size of an arraylist: " + mylist.size());
        System.out.println("Printing data from arraylist: " + mylist);

        //remove specific element from ArrayList
        mylist.remove(3);
        System.out.println("After removing data from arraylist: " + mylist);
        mylist.remove(null);
        System.out.println("After removing data from arraylist: " + mylist);

        //inserting element in the arraylist
        mylist.add(3, "welcome");
        System.out.println("After insertion: " + mylist);
        mylist.add(250);
        System.out.println("After adding an element:" + mylist);

        //Modifying element in the arrayList(modify/replace/change)
        mylist.set(3, "Hello");
        System.out.println("After modifying: " + mylist);

        //Access specific element from arrayList
        System.out.println(mylist.get(3));

        //Reading all the elements from the ArrayList
        //1.using normal for loop: we need to know starting&ending point & condition
        for (int i = 0; i < mylist.size(); i++) {
            System.out.println(mylist.get(i));
        }
        System.out.println("***************************");

        //2.using enhanced for loop/ for each loop
        for (Object x : mylist) {
            System.out.println(x);
        }
        System.out.println("**********************");

        //3.using iterator
        Iterator it = mylist.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("**********************");

        //Checking arrayList empty or not
        System.out.println("Is arrayList is empty: "+ mylist.isEmpty());

        //Remove all the element from arrayList
        ArrayList mylist2= new ArrayList();
        mylist2.add(200);
        mylist2.add(10.25);
        mylist2.add('l');
        mylist2.add(100);

        mylist.removeAll(mylist2);
        System.out.println("After removing multiple elements: "+mylist);

        //Remove all the elements/ clear
        mylist.clear();
        System.out.println("Is arrayList is empty: "+ mylist.isEmpty());






    }
}
