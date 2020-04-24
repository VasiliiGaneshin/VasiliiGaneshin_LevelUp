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
        Addition addition = new Addition();
        Substraction substraction = new Substraction();
        Multiplication multiplication = new Multiplication();
        Power power = new Power();
        Factorial factorial = new Factorial();
        Fibonacci fibonacci = new Fibonacci();

        double num1, num2, result, result2;
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
                result = addition.add(num1, num2);
                System.out.println(result);
                break;
            case 2:
                result = substraction.sub(num1, num2);
                System.out.println(result);
                break;
            case 3:
                result = multiplication.mult(num1, num2);
                System.out.println(result);
                break;
            case 4:
                result = power.power(num1, numInt2);
                System.out.println(result);
            case 5:
                result = factorial.calculateFactorial(numInt1);
                System.out.println(result);

//                result2 = factorial.calculateFactorial(numInt2);
//                System.out.println(result2);
            case 6:
                result = fibonacci.fibonacci(numInt1);
                System.out.println(result);

//                result2 = fibonacci.fibonacci(numInt2);
//                System.out.println(result2);
            default:
                break;
        }
    }
}