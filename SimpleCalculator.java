import java.util.Scanner;

public class SimpleCalculator {

    public void startCalculate() {
        Scanner sc = new Scanner(System.in);
        double operand1, operand2, result;
        int choice;

        System.out.println("Welcome to use the calculator");

        // Ask user input
        System.out.println("Please enter two numbers: ");
        // Enter number 1
        System.out.print("Enter number 1: ");
        operand1 = sc.nextDouble();
        System.out.print("Enter number 2: ");
        operand2 = sc.nextDouble();

        // choose the move
        System.out.println("Choose your action: \n" +
                            "1) addition\n" +
                            "2) subtraction\n" +
                            "3) multiplication\n" +
                            "4) division");
        choice = sc.nextInt();

        switch(choice){
            case 1:
                addition(operand1, operand2);
                break;
            case 2:
                subtraction(operand1, operand2);
                break;
            case 3:
                multiplication(operand1, operand2);
                break;
            case 4:
                division(operand1, operand2);
                break;
            default:
                System.out.println("Error: you did not enter the correct choice. ");
                break;
        }
    }

    public static void addition(double a, double b) {
        double result = a + b;
        System.out.println("Answer is: " + result);
    }

    public static void subtraction(double a, double b) {
        double result = a - b;
        System.out.println("Answer is: " + result);
    }

    public static void multiplication(double a, double b) {
        double result = a * b;
        System.out.println("Answer is: " + result);
    }
    public static void division(double a, double b) {
        double result = a / b;
        System.out.println("Answer is: " + result);
    }
}
