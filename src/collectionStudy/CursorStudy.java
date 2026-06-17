package collectionStudy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class CursorStudy {
    static void main(String[] args) {
        //cursor is used to traverse in list .3 types to create list-Arraylist ,vector ,linklist
        //three types fo cursor-->1.Iterator 2.ListIterator 3.Enumaration
        //1st we can see how cursor is used traverse in 1.Arraylist
        // is from java util package .object is String type .capacity reversed 10 memory space
        ArrayList<String>arrayList= new ArrayList<>();

        arrayList.add("mona");
        arrayList.add("gatha");
        arrayList.add("abhijit");
        arrayList.add("trupti");
        arrayList.add("vedant");
        arrayList.add("pooja");
        System.out.println(arrayList);  //print element list

        //print one by one 1.for loop 2.advance for loop(for each loop)

        //1.for loop
        for(int i=0;i<=arrayList.size()-1;i++)   //1 2 3   // size method
        {
            System.out.println(arrayList.get(i));//0 1 2 3  //get method
        }
        System.out.println("+++++++++++");

       //2.for each loop
        //support only array and collection

        for( String at:arrayList)
        {
            System.out.println(at);
        }
        System.out.println("+++++++++");

        //Types of cursor-->1.iterator

        Iterator<String> it = arrayList.iterator(); //create iterator 1st

        while (it.hasNext())    //hasNext ,next methods of iterator
        {
            //System.out.println(it.next());
            //remove method
            it.next();
            //it.remove();
        }System.out.println(arrayList);

        System.out.println("+++++66++++");

        Iterator<String> it1 = arrayList.iterator();
        while(it1.hasNext())
        {
            System.out.println(it1.next());
        }
        System.out.println("+++++66++++");

        //2.listIterator
        ListIterator<String> lit = arrayList.listIterator();

        while (lit.hasNext())
        {
            System.out.println(lit.next());
        }
        System.out.println("+++++++++");

        //previous method of listIterator -->its bidirectional cursor
        while (lit.hasPrevious())
        {
            System.out.println(lit.previous());
        }

    }
}
