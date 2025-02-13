package JavaBasics.Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        //Declaration
        HashMap hashmap = new HashMap();
        Map map = new HashMap();
        HashMap<Integer, String> hm = new HashMap<Integer, String>();//mandatory to specify the types of Keys&Values.

        //Adding pairs
        hm.put(101, "Likhitha");
        hm.put(102, "John");
        hm.put(103, "Smith");
        hm.put(104, "James");
        hm.put(102, "David");

        System.out.println(hm); //{101=Likhitha, 102=David, 103=Smith, 104=James}
        System.out.println("Size of an HashMap: " + hm.size());

        //Removing 1 pair
        hm.remove(103);
        System.out.println("After removing pair: " + hm);

        //accessing specific value of the particular key
        System.out.println(hm.get(102));

        //get all the key from HashMap
        System.out.println(hm.keySet());

        //get all the values from HashMap
        System.out.println(hm.values());

        //Access keys along with values from Hashmap
        System.out.println(hm.entrySet());

        //Change the value of the specific values
        hm.put(104, "Raul");
        System.out.println(hm.entrySet());

        //Reading data from HashMap
        //using for each
        for (int k:hm.keySet()){
            System.out.println(k+"         "+hm.get(k));

        }
        //using Iterator
        Iterator<Map.Entry<Integer,String>>it=hm.entrySet().iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        Iterator<Map.Entry<Integer,String>>itt=hm.entrySet().iterator();
        while (itt.hasNext()){
            Map.Entry<Integer,String > entry=itt.next();
            System.out.println(entry.getKey()+"       "+entry.getValue());
        }

        //clearing data from HashMap
        hm.clear();
        System.out.println(hm);
        System.out.println("Is hashmap is empty?: "+hm.isEmpty());
    }
}
