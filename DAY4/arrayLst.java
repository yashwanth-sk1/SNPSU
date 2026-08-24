package DAY4;

import java.util.ArrayList;

// Program to show Simple ArrayList Demo
public class arrayLst {
    public static void main(String[] args) {

        // create an ArrayList
        ArrayList list = new ArrayList();

        System.out.println("Initial size of ArrayList before adding elements: " + list.size());
        System.out.println("ArrayList is empty before adding values: " + list.isEmpty());
        System.out.println("Contents of ArrayList before adding values: " + list);


        list.add("C");
        list.add("A");
        list.add("E");
        list.add("B");
        list.add("D");
        list.add("F");


        list.add("A");
        list.add(null);

        System.out.println("Size of ArrayList after adding elements: " + list.size());
        System.out.println("ArrayList is empty after adding values: " + list.isEmpty());

        System.out.println("after adding values: " + list);

        
        boolean b1 = list.contains("E");
        System.out.println("Value E is present: " + b1);

        boolean b2 = list.contains("R");
        System.out.println("Value R is present: "+b2);


    }
}