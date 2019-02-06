/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jswrigh
 */
public class Collections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Example of Lists");
        demoLists();
        System.out.println("Example of Maps");
        demoMaps();
        System.out.println("Example of Queues");
        demoQueues();
        System.out.println("Example of Sets");
        demoSets();
        System.out.println("Example of Trees");
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
        
    }

    private static void demoQueues() {
        
    }

    private static void demoSets() {
        
    }

    private static void demoTrees() {
        
    }
}
