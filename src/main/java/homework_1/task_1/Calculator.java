package homework_1.task_1;

/*
* Classname: Calculator
* Version: 1.0
* Date: 24.04.2020
*/

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.startCalculator();
    }

    public void startCalculator() {
        Scanner scan = new Scanner(System.in);

        double num1, num2, result;
        int selection;

        System.out.print("Enter first number: ");
        num1 = scan.nextDouble();

        System.out.println("Choose the operation: ");
        System.out.println("1. + ");
        System.out.println("2: - ");
        System.out.println("3: * ");
        System.out.println("4: power ");
        System.out.println("5: factorial ");
        System.out.println("6: fibonacci");

        selection = scan.nextInt();

        System.out.print("Enter second number: ");
        num2 = scan.nextDouble();

        int numInt1 = (int) num1;
        int numInt2 = (int) num2;

        switch (selection) {
            case 1:
                result = new Addition().add(num1, num2);
                System.out.println(result);
                break;
            case 2:
                result = new Substraction().sub(num1, num2);
                System.out.println(result);
                break;
            case 3:
                result = new Multiplication().mult(num1, num2);
                System.out.println(result);
                break;
            case 4:
                result = new Power().power(num1, numInt2);
                System.out.println(result);
                break;
            case 5:
                result = new Factorial().calculateFactorial(numInt1);
                System.out.println(result);
                break;
            case 6:
                result = new Fibonacci().fibonacci(numInt1);
                System.out.println(result);
                break;
            default:
                break;
        }
    }
}