package collectionStudy;
import java.awt.desktop.SystemEventListener;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;
public class VectorStudy {
    static void main(String[] args) {
        //Vector is class from java util package..Object is generic type...object is created having 10 memory space reserved
        Vector<Object> vector = new Vector<>();
        System.out.println(vector); //empty
        vector.add("test");
        vector.add(null);
        vector.add(null);
        vector.add(123);
        vector.add(123);
        vector.add(null);
        vector.add(true);
        vector.add('A');
        vector.add("test");
        System.out.println(vector);

        //methods of vector
        //1.add
        vector.add(2, 99);
        System.out.println(vector);

        //2.get
        System.out.println(vector.get(4));

        //3.addElement
        vector.addElement(34);
        System.out.println(vector);

        //4.elementAt
        System.out.println(vector.elementAt(7));

        //5.firsElement
        System.out.println(vector.firstElement());

        //6.lastElement
        System.out.println(vector.lastElement());

        //for print list one by one-->2 ways-->1.for loop 2.for each loop
        //1.forloop
        for (int i = 0; i <= vector.size() - 1; i++) {
            System.out.println(vector.get(i));
        }
        System.out.println("*********");
        //2.for each loop
        for (Object v : vector) {
            System.out.println(v);
        }
        System.out.println("*********");

         //create cursor-->1.iterator 2.listIterator 3.Enumaration
        //1.Iterator
        Iterator<Object> it = vector.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("*********");

        //2.listIterator
        ListIterator<Object> lit = vector.listIterator();
        while (lit.hasNext()) {
            System.out.println(lit.next());
        }
        System.out.println("*********");

        //3.enumaration
        Enumeration<Object> ele = vector.elements();

        while (ele.hasMoreElements()) {
            System.out.println(ele.nextElement());
        }

    }
}
