package calculate;

public class Calculator {
    //instance variable
    int add, sub, mult, div;

    // instance method with two argument
    public void addition(int a, int b) {
        System.out.println(+add);
    }

    // instance method with two argument
    public void subtraction(int a, int b) {
        System.out.println(+sub);
    }

    // instance method with two argument
    public void division(int a, int b) {
        System.out.println(+mult);
    }

    // instance method with two argument
    public void multiplication(int a, int b) {
        System.out.println(+div);
    }

    // instance method with three argument
    public void calculateResult(int a, int b, char symbol) {
        //condition for '+' addition
        if (symbol == '+') {
            add = a + b;
            addition(a, b);
            //condition for '-' subtraction
        } else if (symbol == '-') {
            sub = a - b;
            subtraction(a, b);
            //condition for '*' multiplication
        } else if (symbol == '*') {
            mult = a * b;
            multiplication(a, b);
            //condition for '/' division
        } else if (symbol == '/') {
            div = a / b;
            division(a, b);
        }
    }

}
