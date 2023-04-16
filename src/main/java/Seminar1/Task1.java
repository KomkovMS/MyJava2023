package Seminar1;

import java.util.Scanner;

/*
Написать программу, которая запросит пользователя ввести <Имя> в консоли.
Получит введенную строку и выведет в консоль сообщение “Привет, <Имя>!”
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Hello what is your name?: ");
        String name = iScanner.nextLine();
        System.out.printf("Привет, %s!", name);
        iScanner.close();
    }
}
