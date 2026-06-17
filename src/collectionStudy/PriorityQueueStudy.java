package collectionStudy;


import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueStudy {
    static void main(String[] args) {
        PriorityQueue<Object> priorityQueue = new PriorityQueue<>();
        priorityQueue.add("Test");
        priorityQueue.add("mona");
        priorityQueue.add("testing");
        priorityQueue.add("java");
        priorityQueue.add("automation");
        priorityQueue.add("testing");
        priorityQueue.add("testing");
       // priorityQueue.add(null);
        System.out.println(priorityQueue);

        System.out.println("==============");

        for (Object pq : priorityQueue) {
            System.out.println(pq);
        }
        System.out.println("==============");


        Iterator<Object> it = priorityQueue.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }

    }


}
