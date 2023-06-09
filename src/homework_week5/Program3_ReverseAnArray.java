package homework_week5;

import java.util.Scanner;

/**
 * 3. Write a Java program to reverse an array of integer values.
 */

public class Program3_ReverseAnArray {
    public static void main(String[] args) {
        reverseInteger();//call static method into main method
    }

    public static void reverseInteger() {
        int n, i, j = 0;
        //Scanner declaration for reading input form console
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements in the array : ");
        n = sc.nextInt();
        int array[] = new int[n];
        int rev[] = new int[n];
        System.out.println("Enter " + n + " elements ");
        for (i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Reverse of an array is : ");
        for (i = n; i > 0; i--, j++) {
            rev[j] = array[i - 1];
            System.out.println(rev[j]); // reversed value will be displayed

        }
    }
}
