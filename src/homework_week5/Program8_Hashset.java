package homework_week5;

import java.util.HashSet;

/**
 * Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
 * Show which numbers between 1 and 10 are in the set. (Hint: use for loop and if
 * else)
 */

public class Program8_Hashset {
    public static void main(String[] args) {
        set(); //static method calling
    }

    /**
     * This static method
     */
    public static void set() {
        HashSet<Integer> number = new HashSet(); ////hashSet obj created
        number.add(4);
        number.add(7);
        number.add(8);

        for (Integer n : number) {
            if (n >= 1 && n <= 10)  // condition to check number is between 1 and 10
            {
                System.out.println(+n + " Number is between 1 and 10 ");
            }
        }
    }
}
