package homework_week5;

import java.util.ArrayList;

/**
 * Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop.
 */

public class Program4_ArrayList_Colour {
    public static void main(String[] args) {
        Program4_ArrayList_Colour obj = new Program4_ArrayList_Colour();// create object for instance method
        obj.color(); // calling instance method
    }

    /*
    This is instance method
     */
    public void color() {
        // Declaring and initializing ArrayList
        ArrayList<String> color = new ArrayList();
        color.add("Black");
        color.add("White");
        color.add("Pink");
        color.add("Red");
        color.add("Brown");
        color.add("Orange");
        for (String a : color) //forEach loop
        {
            System.out.println(a); // Print the elements of ArrayList
        }
    }
}
