package homework_week5;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 6.Write a Java program to retrieve an element (at a specified index) from a given
 * array list
 */

public class Program6_RetrieveArrayList {
    public static void main(String[] args) {
        Program6_RetrieveArrayList obj = new Program6_RetrieveArrayList(); //Create instance method object.
        obj.retrieve();//instance method calling
    }

    public void retrieve() {
        ArrayList list = new ArrayList(); //obj created for arraylist
        //Add obj into list collection
        list.add("Laptop");
        list.add("Keyboard");
        list.add("Mouse");
        list.add("CPU");
        list.add("Printer");
        list.add("RAM");
        list.add("Driver");
        Iterator newList = list.iterator();
        while (newList.hasNext()) {
            System.out.println(newList.next());
        }
        System.out.println("Value at 3rd Index is :  " + list.get(4)); //print the value which is at 3rd index

    }
}
