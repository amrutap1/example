import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get input for num1
        int num1;
        do {
            // System.out.print("Enter num1 (between 10 and 100 inclusive): ");
            while (!input.hasNextInt()) {
                System.out.println("Error");
                input.next();
            }
            num1 = input.nextInt();
        } while (num1 < 10 || num1 > 100);

        // Get input for num2
        int num2;
        do {
            //System.out.print("Enter num2 (between -10 and 10 inclusive): ");
            while (!input.hasNextInt()) {
                System.out.println("Error");
                input.next();
            }
            num2 = input.nextInt();
        } while (num2 < -10 || num2 > 10);

        // Get input for operation
        String operation;
        do {
            // System.out.print("Enter operation (+,-,*,/): ");
            operation = input.next();
        } while (!operation.matches("[+\\-*/]"));

        // Perform calculation
        int result = 0;
        switch (operation) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
        }

        System.out.println(num1 + " " + operation + " " + num2 + " = " + result);

        input.close();
    }
}