package homework_week5;

import java.util.Scanner;

/**
 * 2.Write a java program to input student Name, roll No, and three subjects Math, Science and
 * English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
 * Input, Marks should between 0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if
 * %> = 80 A+, %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 * using if else and while loop.
 * _______________________________
 * | |
 * | Mark Sheet |
 * |_______________________________|
 * | Name : Jay |
 * | Roll No: 08 |
 * |_______________________________|
 * | Subjects : Marks |
 * |_______________________________|
 * | Math : 98 |
 * | Science : 90 |
 * | English : 85 |
 * |_______________________________|
 * | Total : 273 |
 * |_______________________________|
 * | Percentage : 91.0 |
 * | Result : Pass |
 * | Grade : A+ |
 * |_______________________________|
 */

public class Program2_StudentMarkSheet {
    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Student Name : ");
        String name = scanner.next();

        System.out.println("Enter Student rollNo : ");
        int id = scanner.nextInt();

        result(id, name);
        scanner.close();
    }

    public static void result(int id, String name) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Marks of Subject Maths   : ");
        int mathsMarks = scanner.nextInt();
        int math1 = mathsMarks;
        while (math1 < 0 || math1 > 100) {
            System.out.print("Invalid input, Marks should between 0 to 100");
            System.out.print("Please enter correct marks : ");
            math1 = scanner.nextInt();
        }
        System.out.print("Enter Marks of Subject Science : ");
        int scienceMarks = scanner.nextInt();
        int sci1 = scienceMarks;
        while (sci1 < 0 || sci1 > 100) {
            System.out.print("Invalid input, Marks should between 0 to 100");
            System.out.print("Please enter correct marks : ");
            sci1 = scanner.nextInt();
        }
        System.out.print("Enter Marks of Subject English : ");
        int englishMarks = scanner.nextInt();
        int eng1 = englishMarks;
        while (eng1 < 0 || eng1 > 100) {
            System.out.print("Invalid input, Marks should between 0 to 100");
            System.out.print("Please enter correct marks : ");
            eng1 = scanner.nextInt();
        }
        // Calculating the results on subjects marks
        int total = (math1 + sci1 + eng1);
        int percentage = (total * 100) / 300;
        String result;   //variable declare for result
        if (eng1 < 35 || math1 < 35 || sci1 < 35) {
            result = "Fail";
        } else {
            result = "Pass";
        }
        // Calculating the grade on percentage and result
        String grade;
        if (percentage >= 80) {
            grade = "A+";
        } else if (percentage >= 60 && percentage < 80) {
            grade = "A";
        } else if (percentage >= 50 && percentage < 60) {
            grade = "B";
        } else if (percentage >= 35 && percentage < 50) {
            grade = "C";
        } else {
            grade = " ";
        }
        // Printing the Marks sheet
        System.out.println("|------------------------------ |");
        System.out.println("|           Mark Sheet          |");
        System.out.println("|_______________________________|");
        System.out.println("| Name          : " + name + "         |");
        System.out.println("| Roll No       :   " + id + "           |");
        System.out.println("|_______________________________|");
        System.out.println("| Subjects      :    Marks      |");
        System.out.println("|_______________________________|");
        System.out.println("| Math          :   " + math1 + "          |");
        System.out.println("| Science       :   " + sci1 + "          |");
        System.out.println("| English       :   " + eng1 + "          |");
        System.out.println("|_______________________________|");
        System.out.println("| Total         :    " + total + "        |");
        System.out.println("|_______________________________|");
        System.out.println("| Percentage    :   " + percentage + "          |");
        System.out.println("| Result        :  " + result + "         |");
        System.out.println("| Grade         :   " + grade + "           |");
        System.out.println("|_______________________________|");

    }


}

