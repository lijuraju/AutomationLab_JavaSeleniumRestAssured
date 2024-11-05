package corejava.nov.nov042024;

import java.util.PriorityQueue;

public class Queue_Demo {
    public static void main(String[] args) {

        PriorityQueue pq = new PriorityQueue();

        pq.add("Liju");
        pq.offer("Raju");

        System.out.println(pq);
    }
}
