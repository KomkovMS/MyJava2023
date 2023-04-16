package Hw1;
import java.util.Scanner;
/*
Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение
чисел от 1 до n)
 */
public class Hw1Task1 {
    /**
     * Вычисляет сумму чисел от 1 до n.
     * @param n число, до которого нужно посчитать сумму.
     * @return сумма чисел от 1 до n.
     */
    static int calculateSum(int n) {
        int result = 0;
        for (int i = 0; i <= n; i++) {
            result += i;
        }
        return result;
    }

    /**
     * Вычисляет факториал числа n.
     * @param n число, факториал которого нужно посчитать.
     * @return факториал числа n.
     */
    static int calculateFactorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Enter number n = ");
        if (!iScanner.hasNextInt()) {
            System.out.println("Ошибка: введено не число.");
            System.exit(0);
        }
        int n = iScanner.nextInt();
        int totalSum = calculateSum(n);
        long totalMult = calculateFactorial(n);
        System.out.printf("Sum of numbers from 1 to n = %d\n", totalSum);
        System.out.printf("Product of numbers from 1 to n = %d", totalMult);

        iScanner.close();
    }
}
