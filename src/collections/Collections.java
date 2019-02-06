/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

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
        demoQueues();
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
        
    }

    private static void demoSets() {
        
    }

    private static void demoTrees() {
        
    }
}
