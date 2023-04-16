package Hw1;

import java.util.Scanner;

/*
Реализовать простой калькулятор
Введите первое число: 12
Введите операцию: +
Введите второе число: 1
Ответ: 13
 */
public class Hw1Task3 {
    /**
     * Производит заданную математическую операцию над двумя числами.
     *
     * @param a  Первое число.
     * @param b  Второе число.
     * @param op Операция.
     * @return Результат операции в виде строки. Если операция недопустима,
     * вернется сообщение об ошибке.
     */
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
        return result;
    }

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = iScanner.nextInt();
        iScanner.nextLine();
        System.out.print("Enter operation: ");
        String operation = iScanner.nextLine();
        System.out.print("Enter the second number: ");
        int num2 = iScanner.nextInt();
        System.out.println("Ответ: " + calculate(num1, num2, operation));

        iScanner.close();
    }
}
