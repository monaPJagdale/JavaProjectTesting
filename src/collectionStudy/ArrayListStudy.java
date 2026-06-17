package collectionStudy;


import java.util.ArrayList;

public class ArrayListStudy {
    static void main(String[] args) {
        //collection
        //types of collection-->1.List 2.set 3.Queue
        //List-->Types of List
        //1.ArrayList-->

        ArrayList<Object> arrayList=new ArrayList<>();//interface inbuilt
        //ArrayList of type Object called as -->Genric array List-->

        //How to add elements in ArrayList
        //method--> add()

        arrayList.add("Velocity");
        arrayList.add(null);
        arrayList.add(7666);
        arrayList.add('A');
        arrayList.add(true);
        arrayList.add(85.54f);
        arrayList.add('B');
        arrayList.add('C');
        arrayList.add('A');
        arrayList.add(null);
        arrayList.add("Vedant");
        arrayList.add("Velocity");
        arrayList.add(20.45f);

        System.out.println(arrayList); //call through direct object
        // output--> [Velocity, null, 7666, A, true, 85.54, B, C, A, null, Vedant, Velocity, 20.45]

        //If i want to add Testing--> after 1st Velocity
        arrayList.add(1,"Testing");
        System.out.println(arrayList);
        //output--> [Velocity, Testing, null, 7666, A, true, 85.54, B, C, A, null, Vedant, Velocity, 20.45]

        //If i want to add Joshi--> after Vedant
        arrayList.add(12,"Joshi");
        System.out.println(arrayList);
        //output-->[Velocity, Testing, null, 7666, A, true, 85.54, B, C, A, null, Vedant, Joshi, Velocity, 20.45]

        //if i want to add ArrayList--> 1st position of list
        arrayList.addFirst("ArrayList");
        System.out.println(arrayList);
        //output-->[ArrayList,Testing, null, 7666, A, true, 85.54, B, C, A, null, Vedant, Joshi, Velocity, 20.45]

        //addLast-if i want to add Data--> last position of list
        arrayList.addLast("Data");
        System.out.println(arrayList);


        //clear()-if want to clear(empty list)
        //arrayList.clear();
        //System.out.println(arrayList);

        //clone()- return exact same copy of arraylist
        arrayList.clone();
        System.out.println(arrayList);

        //contains()- returns true the specified element present in the list
       boolean result=arrayList.contains("Vedant");
        System.out.println(result);

        //get()-return the element of provided index of list
        System.out.println(arrayList.get(6));

        //getFirst-returns first element of the collection
        System.out.println(arrayList.getFirst());
        //getLst-returns last element of the collection
        System.out.println(arrayList.getLast());

        //indexOf()-first occurrence of duplicate element index returns
        System.out.println(arrayList.indexOf("Velocity"));
        //LastIndexOf-
        System.out.println(arrayList.lastIndexOf("Velocity"));

        System.out.println("==============");
        //size()-count of elements present in the list
        System.out.println(arrayList.size());

        //isEmpty()-Returns true if this list contains no elements
        System.out.println(arrayList.isEmpty());

        //remove() -the element that was removed from the list
        Object result2=arrayList.remove(14);
        System.out.println(result2);
        System.out.println(arrayList);
        //removeFirst
        arrayList.removeFirst();
        arrayList.removeLast();
        System.out.println(arrayList);

        //set()-replace element at specified index
        arrayList.set(2,"mona");
        System.out.println(arrayList);
    }
}
