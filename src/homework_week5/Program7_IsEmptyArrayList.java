package homework_week5;

import java.util.ArrayList;

/**
 * 7.Write a Java program to test if an array list is empty or not
 */

public class Program7_IsEmptyArrayList {
    public static void main(String[] args) {
        emptyArray(); //Calling method

    }

    /**
     * This is static method
     */
    public static void emptyArray() {

        ArrayList months = new ArrayList(); //obj created for arraylist
        months.add("January");
        months.add("February");
        months.add("March");
        months.add("April");
        months.add("May");
        months.add("June");
        months.add("July");
        months.add("August");
        months.add("September");
        months.add("October");
        months.add("November");
        months.add("December");
        ArrayList empty = new ArrayList<>();


        System.out.println(months.isEmpty());//check whether Arraylist is empty or not
        System.out.println(empty.isEmpty());

    }

}
