package Hw2;

import java.util.Scanner;
import java.util.logging.Logger;

/*
3*дополнительно. К калькулятору из предыдущего дз добавить логирование.
1 + 3 = 4
 */
public class Hw2_Task3 {
    private static final Logger logger = Logger.getLogger(Hw2_Task3.class.getName());

    static String calculate(int a, int b, String op) {
        String result = "There is no such operator!";
        switch (op) {
            case "+":
                result = String.valueOf(a + b);
                break;
            case "-":
                result = String.valueOf(a - b);
                break;
            case "/":
                if (b != 0) {
                    result = String.valueOf(a / b);
                } else {
                    result = "Division by zero!";
                }
                break;
            case "*":
                result = String.valueOf(a * b);
                break;
        }
        logger.info(String.format("Calculating %d %s %d = %s", a, op, b, result));
        return result;
    }

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        logger.info("Program started.");
        System.out.print("Enter the first number: ");
        int num1 = iScanner.nextInt();
        iScanner.nextLine();
        System.out.print("Enter operation: ");
        String operation = iScanner.nextLine();
        System.out.print("Enter the second number: ");
        int num2 = iScanner.nextInt();
        System.out.println("Ответ: " + calculate(num1, num2, operation));
        logger.info("Program finished.");
        iScanner.close();
    }
}
