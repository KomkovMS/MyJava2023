package Hw1;
import java.util.Scanner;
/*
Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение
чисел от 1 до n)
 */
public class Hw1Task1 {
    static int getSum(int n) {
        int result = 0;
        for (int i = 0; i <= n; i++) {
            result += i;
        }
        return result;
    }

    static int getMult(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Enter number n = ");
        int n = iScanner.nextInt();
        int totalSum = getSum(n);
        int totalMult = getMult(n);
        System.out.printf("Cумма чисел от 1 до n = %d\n", totalSum);
        System.out.printf("произведение чисел от 1 до n = %d", totalMult);
        // n = 4 1+2+3+4 = 10 1*2*3*4 = 24
    }
}
