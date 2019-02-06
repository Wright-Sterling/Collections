/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeSet;

/**
 *
 * @author jswrigh
 */
public class Collections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("----Example of Lists----");
        demoLists();
        System.out.println("----Example of Maps----");
        demoMaps();
        System.out.println("----Example of Queues----");
        demoQueues(); // unordered using priority queue
        demoLinkedLists(); // ordered FIFO
        System.out.println("----Example of Sets----");
        demoSets();
        System.out.println("----Example of Trees----");
        demoTrees();
    }
    
    private static void demoLists() {
        List<String> myList = new ArrayList<String>();  
        myList.add("Alpha");  
        myList.add("Bravo");  
        myList.add("Delta");  
        for(String s:myList){  // iterate over list
            System.out.println(s);
        }
        myList.add(2,"Charlie"); // inserting element at third index location
        System.out.println("Array after inserting element at 3rd location: " +myList.get(2));  
        for(String s:myList){  // iterate over list
            System.out.println(s);
        }
    }

    private static void demoMaps() {
        Map<String,String> myMap=new HashMap<String,String>();  
        myMap.put("A","Alpha");  
        myMap.put("B","Bravo");  
        myMap.put("C","Charlie");  
        //Show elements. They may not print in the above order
        for (Map.Entry m : myMap.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());  
        }
        
        System.out.println("Adding some entries...");
        myMap.put("D","Delta");  
        myMap.put("E","Echo");  
        myMap.put("F","Frank");  
        myMap.put("G","Golf");  
        myMap.put("H","Hotel");  
        myMap.put("I","India");          
        for (Map.Entry m : myMap.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());  
        }

        System.out.println("Changing the value for entry \"F\"...");
        myMap.replace("F", "Foxtrot");
        for (Map.Entry m : myMap.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());  
        }
    }

    private static void demoQueues() {
        PriorityQueue<String> myQueue=new PriorityQueue<String>();  
        myQueue.add("Wake up");  
        myQueue.add("Pray");  
        myQueue.add("Read scriptures");  
        myQueue.add("Shave");  
        myQueue.add("Shower");  
        System.out.println("head:"+myQueue.element());  
        System.out.println("head:"+myQueue.peek()); 
        // Without a comparator, the list items are not in the above order
        System.out.println("Iterating through the queue...");
        Iterator itr=myQueue.iterator();  
        while(itr.hasNext()){  
            System.out.println(itr.next());  
        }  
        myQueue.remove();  
        myQueue.poll();  
        System.out.println("After removing two elements:");  
        Iterator<String> itr2=myQueue.iterator();  
        while(itr2.hasNext()){  
            System.out.println(itr2.next());  
        }  
    }

    private static void demoLinkedLists() {
        LinkedList <String> myQueue = new LinkedList <String>();
        myQueue.add("Wake up");  
        myQueue.add("Pray");  
        myQueue.add("Read scriptures");  
        myQueue.add("Shave");  
        myQueue.add("Shower");  
        System.out.println("head:"+myQueue.element());  
        System.out.println("head:"+myQueue.peek()); 
        // As a linked list, the items are now in the above FIFO order
        System.out.println("Iterating through the queue...");
        Iterator itr=myQueue.iterator();  
        while(itr.hasNext()){  
            System.out.println(itr.next());  
        }  
        myQueue.remove();  
        myQueue.poll(); 
        // Still in order with last items remaining
        System.out.println("After removing two elements:");  
        Iterator<String> itr2=myQueue.iterator();  
        while(itr2.hasNext()){  
            System.out.println(itr2.next());  
        }          
    }
    
    private static void demoSets() {
        HashSet<String> mySet=new HashSet<String>();  
        mySet.add("Lists");  
        mySet.add("Maps");  
        mySet.add("Queus");  
        mySet.add("Sets");  
        mySet.add("Trees");  
        // The set is unordered
        Iterator<String> itr=mySet.iterator();  
        while(itr.hasNext()){  
            System.out.println(itr.next());
        }   
        // Try to add a duplicate item
        mySet.add("Sets");
        System.out.println("Set elements after trying to add \"Sets\" again.");
        Iterator<String> itr2=mySet.iterator();  
        while(itr2.hasNext()){  
            System.out.println(itr2.next());
        } 
    }

    private static void demoTrees() {
        TreeSet<String> myTree=new TreeSet<String>();  
        myTree.add("Lists");  
        myTree.add("Maps");  
        myTree.add("Queus");  
        myTree.add("Sets");  
        myTree.add("Trees");  
        // The set is ordered alphabeticaly
        Iterator<String> itr=myTree.iterator();  
        while(itr.hasNext()){  
            System.out.println(itr.next());
        }   
        // Try to add a duplicate item
        myTree.add("Trees");
        System.out.println("Set elements after trying to add \"Trees\" again.");
        Iterator<String> itr2=myTree.iterator();  
        while(itr2.hasNext()){  
            System.out.println(itr2.next());
        } 
    }    
}
