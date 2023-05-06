package Hw4;

import java.util.Scanner;
import java.util.Stack;
import java.util.logging.Logger;

/**
 * Программа-калькулятор для выполнения арифметических операций.
 * После выполнения каждой операции программа предлагает ввести новую операцию
 * либо ввести "отмена", чтобы вернуться к предыдущему ответу.
 */
public class Hw4_Task3 {
    private static final Logger logger = Logger.getLogger(Hw4_Task3.class.
            getName());

    /**
     * Метод для выполнения арифметических операций с двумя числами.
     *
     * @param a  Первое число
     * @param b  Второе число
     * @param op Оператор, обозначающий операцию ("+", "-", "*", "/")
     * @return Результат выполнения операции в виде строки
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
        logger.info(String.format("Calculating %d %s %d = %s", a, op, b,
                result));
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> answerStack = new Stack<>();
        logger.info("Программа запущена.");

        while (true) {
            System.out.print("Введите первое число: ");
            int num1 = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Введите операцию: ");
            String operation = scanner.nextLine();

            if (operation.equals("отмена")) {
                if (answerStack.empty()) {
                    logger.info("Стек ответов пуст.");
                } else {
                    System.out.println("Ответ: " + answerStack.pop());
                }
                continue;
            }

            System.out.print("Введите второе число: ");
            int num2 = scanner.nextInt();
            scanner.nextLine();

            String answer = calculate(num1, num2, operation);
            System.out.println("Ответ: " + answer);
            answerStack.push(answer);

            while (true) {
                System.out.print("Введите другой оператор, чтобы продолжить, "
                        + "или введите отмена, чтобы вернуться к предыдущему "
                        + "ответу... ");
                String nextOp = scanner.nextLine();
                if (nextOp.equals("отмена")) {
                    if (answerStack.empty()) {
                        logger.info("Стек ответов пуст.");
                    } else {
                        answer = answerStack.pop();
                        System.out.println("Ответ: " + answer);
                    }
                    continue;
                }
                System.out.print("Введите следующее число: ");
                int nextNum = scanner.nextInt();
                scanner.nextLine();
                answer = calculate(Integer.parseInt(answer), nextNum, nextOp);
                System.out.println("Ответ: " + answer);
                answerStack.push(answer);
            }
        }
    }
}
