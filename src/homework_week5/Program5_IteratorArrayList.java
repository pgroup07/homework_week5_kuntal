package homework_week5;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * 5.Write a Java program to iterate through all elements in an array list using
 * Iterator.
 */

public class Program5_IteratorArrayList {
    public static void main(String[] args) {
        Program5_IteratorArrayList obj = new Program5_IteratorArrayList(); // Create instance method object.
        obj.myIterator(); //instance method calling

    }

    /**
     * This is instance method
     */
    public void myIterator() {
        // Declaring and initializing ArrayList
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        // Iterating ArrayList using Iterator
        Iterator it = numbers.iterator();

        // Holds true till there is single element
        // remaining in the list
        while (it.hasNext()) // Using while loop

            // Print the elements of ArrayList
            System.out.print(it.next() + " ");
    }
}
