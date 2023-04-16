package Lesson1;

import java.util.Scanner;

public class GettingDataFromTheTerminal {
    public static void main(String[] args) {
        // Получение данных из терминала

        Scanner iScanner = new Scanner(System.in);
        System.out.printf("name: "); // Maks
        String name = iScanner.nextLine();
        System.out.printf("Привет, %s!", name); // Привет, Maks!


        // Некоторые примитивы
        System.out.printf("int a: "); // 3
        int x = iScanner.nextInt();
        System.out.printf("double a: "); // 4,000000
        double y = iScanner.nextDouble();
        System.out.printf("%d + %f = %f", x, y, x + y); // 3 + 4,000000 = 7,000000

        // Проверка на соответствие получаемого типа
        System.out.printf("int a: ");
        boolean flag = iScanner.hasNextInt(); //!!!!!!!!!!!!!!!!!!!
        System.out.println(flag);
        int i = iScanner.nextInt();
        System.out.println(i);
        iScanner.close();


    }

}
