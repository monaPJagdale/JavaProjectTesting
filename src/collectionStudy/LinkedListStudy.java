package collectionStudy;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListStudy {
    static void main(String[] args) {
        LinkedList<Integer>linkedList=new LinkedList<>();
        linkedList.add(11);
        linkedList.add(20);
        linkedList.add(20);
        linkedList.add(null);
        linkedList.add(null);
        linkedList.add(19);
        linkedList.add(32);
        linkedList.add(43);
        //simple way to print LinkedList
        System.out.println(linkedList);

    //methods of LinkedList
        //1.add
        linkedList.add(1,23);
        System.out.println(linkedList);
        //2.get
        linkedList.get(1);
        System.out.println(linkedList);
        //3.addLast
        linkedList.addLast(78);
        //4.addfirst
        linkedList.addFirst(90);
        // 5.clone
        linkedList.clone();
        //6.clear
        //linkedList.clear();
        System.out.println(linkedList);
        //contains
        linkedList.contains(19);
        System.out.println(linkedList);
        //offer()
        linkedList.offer(67);
        linkedList.offerFirst(33);
        linkedList.offerLast(20);
        System.out.println(linkedList);

        //peek()
        System.out.println(linkedList.peek());
        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());
        System.out.println(linkedList);

        //poll()
        System.out.println(linkedList.poll());
        System.out.println(linkedList.pollFirst());
        System.out.println(linkedList.pollLast());
        System.out.println(linkedList);

        //pop()
        linkedList.pop();
        System.out.println(linkedList);


//traversing -ListIterator
        ListIterator<Integer> lit = linkedList.listIterator();
        while (lit.hasNext())
        {
            System.out.println(lit.next());
        }






    }
}
