package collectionStudy;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetStudy {

    public static void main(String[] args) {
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(23);
        linkedHashSet.add(13);
        linkedHashSet.add(22);
        linkedHashSet.add(33);
        linkedHashSet.add(43);
        linkedHashSet.add(23);
        linkedHashSet.add(null);
        linkedHashSet.add(null);
        linkedHashSet.add(22);
        System.out.println(linkedHashSet);  //simple  way to print

        //methods of linkedHashSet

        linkedHashSet.addLast(42);
        linkedHashSet.addFirst(11);
        System.out.println(linkedHashSet);
        System.out.println(linkedHashSet.size());
        linkedHashSet.getFirst();
        linkedHashSet.getLast();
        linkedHashSet.removeFirst();
        linkedHashSet.remove(33);
        System.out.println(linkedHashSet);
        //linkedHashSet.clear();
        System.out.println(linkedHashSet.clone());
        //linkedHashSet.equals();
//traversing
        //1.for loop-no index present in linkedHashSet
        //2.for each loop for
        for (Integer l : linkedHashSet) {
            System.out.println(l);
        }
        System.out.println("==========================");
//using cursor
        //1.Iterator-support set
        Iterator<Integer> it = linkedHashSet.iterator();
        //System.out.println(it.next());
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
