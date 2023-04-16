package Hw1;
// Вывести все простые числа от 1 до 1000
public class Hw1Task2 {
    public static void main(String[] args) {
        for (int i = 2; i < 1001; i++) {
            boolean flag = true;
            for (int j = 2; j*j <= i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.printf("%d ", i);
            }
        }
    }
}
