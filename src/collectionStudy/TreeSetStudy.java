package collectionStudy;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetStudy {
    static void main(String[] args) {
        TreeSet<Integer>treeSet= new TreeSet<>();
        treeSet.add(23);
        treeSet.add(23);
        //treeSet.add(null);
        treeSet.add(20);
        treeSet.add(21);
        treeSet.add(19);
        treeSet.add(22);
        System.out.println(treeSet); //simple way to print

//methods of treeSet
    //1.ceilling()
        System.out.println(treeSet.ceiling(100));
        System.out.println(treeSet.ceiling(12));
        System.out.println(treeSet.floor(25));
        System.out.println("=================================");
        System.out.println(treeSet.pollFirst());
        System.out.println(treeSet.pollLast());
        System.out.println(treeSet);

//traversing in treeSet
        //1.for loop-no index is present
        //2.for each loop
         for( Integer ts:treeSet)
         {
             System.out.println(ts);
         }
        System.out.println("=================================");

//cursor
       //iterator-supports set
        Iterator<Integer>it=treeSet.iterator();
          while(it.hasNext())
          {
              System.out.println(it.next());
          }




    }
}
