package collectionStudy;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetStudy {
    static void main(String[] args) {
        HashSet<String>hashSet=new HashSet<>();
        hashSet.add("test");
        hashSet.add("test");
        hashSet.add(null);
        hashSet.add(null);
        hashSet.add("java");
        hashSet.add("selenium");
        hashSet.add("automation");
 //simple way to print..order of insertion is not maintain,only one null value allowed,duplicate not allowed
        System.out.println(hashSet);//[test,null,java,selenium,automation]

        //methods of HashSet
        //1.remove()
        hashSet.remove("test");
        System.out.println(hashSet);

        //2.size
        System.out.println(hashSet.size());

        //3.clear
        //hashSet.clear();

       //contains()
        System.out.println(hashSet.contains("java"));

        //isEmpty()
        System.out.println(hashSet.isEmpty());

        System.out.println("=======================================");
//traversing in HashSet
        //1.for loop-no index in hash set so it cant be use

        //2.for each loop
         for( String hs:hashSet)
         {
             System.out.println(hs);
         }

        System.out.println("=======================================");
 //cursor
        //iterator only-applicable for only List Set and Queue

        Iterator<String>it=hashSet.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }



    }
}
