package OOP_Sem5.Task1_Calc;

import java.util.Locale;
import java.util.Scanner;

/**
 * Представление калькулятора, обеспечивающее ввод-вывод данных.
 */
public class CalculatorView {
    private Scanner scanner;

    /**
     * Конструктор класса CalculatorView.
     * Инициализирует объект класса Scanner для чтения ввода пользователя.
     */
    public CalculatorView() {
        this.scanner = new Scanner(System.in);
    }

    /**
     * Запрашивает у пользователя ввод числа.
     *
     * @return Введенное число
     * @throws InputMismatchException Если введенное значение не является числом
     */
    public Number getInputNumber() {
        System.out.print("Enter a number: ");
        String input = scanner.next();
        return Double.parseDouble(input);
    }

    /**
     * Запрашивает у пользователя ввод оператора (+, -, *, /).
     *
     * @return Введенный оператор
     */
    public char getInputOperator() {
        System.out.print("Enter an operator (+, -, *, /): ");
        return scanner.next().charAt(0);
    }

    /**
     * Выводит результат вычислений на экран.
     *
     * @param result Результат вычислений
     */
    public void displayResult(Number result) {
        System.out.println("Result: " + result.toString());
    }
}
