package calculate;

import java.util.Scanner;

/**
 * 1. Create one package with name calculate
 * 2. Create two class with name “Calculator” and “Main”
 * 3. Create four methods with manes “addition”, “subtraction”, “division”,
 * and “multiplication”. All methods are instance methods and it doesn’t
 * return anything. But it has two parameters with the names “int a” and
 * “int b”. Also each method has System.out.println(). This prints the
 * result. Also create one more method with the name “calculateResult”
 * with three parameters with name int a, int b and char symbol. Write the
 * logic in the calculateResult method that when the user enters first
 * number and second number and symbol based on symbol it does
 * calculate.
 * 4. Write a “main” method into the main class. It has a scanner that takes
 * user input. Also write the logic that it ask user to “Enter first Number:”,
 * “Enter second Number:” “Please enter one of symbol +,-,*, /:” if user
 * enter + symbol result like “Addition of 5 and 10 is: 15” and respective for
 * other symbols.
 * 5. With the result it’s also print one more message “Would you like to do
 * more calculation Please enter “Y” or “N” :” (Hint use while loop if user
 * enter Y program asking the user to enter First Number, and if user enter
 * N programme should terminate)
 */

public class Main extends Calculator {
    public static void main(String[] args) {
        char sign, result;
        Scanner scanner = new Scanner(System.in); // declaring scanner class

        do {
            System.out.println("Enter first Number : ");
            int num1 = scanner.nextInt(); // read first input
            System.out.println("Enter second Number : ");
            int num2 = scanner.nextInt();  // read second input
            System.out.println("Please enter one of symbol +,-,*, / : ");
            char num3 = scanner.next().charAt(0); // read third input
            Main obj = new Main(); // creating an object of a child class to access the properties for both the class
            obj.calculateResult(num1, num2, num3); // calling an instance method from Parent class
            System.out.println("Would you like to do more Calculation ? Enter 'Y' or 'N'");
            sign = scanner.next().charAt(0); // read the input of user choice

        } while (sign == 'y' || sign == 'Y'); // code will be executed if user give the input 'y' or 'Y'
        {
            scanner.close();
        }
    }
}

