package Hw5;

/*
Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек
может иметь несколько телефонов.
Добавить функции 1) Добавление номера
2) Вывод всего
Пример:
Я ввожу: 1
К: Введите фамилию
Я: Иванов
К: Введите номер
Я: 1242353
К: Введите 1) Добавление номера
2) Вывод всего
Я ввожу: 1
К: Введите фамилию
Я: Иванов
К: Введите номер
Я: 547568
К: Введите 1) Добавление номера
2) Вывод всего
Я: 2
Иванов: 1242353, 547568
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Класс PhoneBook представляет собой телефонную книгу, реализованную с
 * использованием HashMap. Он позволяет добавлять номера телефонов для разных
 * фамилий и выводить все номера.
 */
public class Hw5_Task1 {
    private HashMap<String, ArrayList<String>> phoneBook;

    /**
     * Конструктор класса PhoneBook. Инициализирует пустую телефонную книгу.
     */
    public Hw5_Task1() {
        phoneBook = new HashMap<>();
    }

    /**
     * Метод addNumber добавляет новый номер телефона для указанной фамилии.
     *
     * @param lastName    фамилия, для которой добавляется номер
     * @param phoneNumber номер телефона
     */
    public void addNumber(String lastName, String phoneNumber) {
        ArrayList<String> numbers = phoneBook.getOrDefault(lastName,
                new ArrayList<>());
        numbers.add(phoneNumber);
        phoneBook.put(lastName, numbers);
    }

    /**
     * Метод printAll выводит все фамилии и соответствующие им номера телефонов.
     */
    public void printAll() {
        for (String lastName : phoneBook.keySet()) {
            ArrayList<String> numbers = phoneBook.get(lastName);
            System.out.print(lastName + ": ");
            for (String number : numbers) {
                System.out.print(number + ", ");
            }
            System.out.println();
        }
    }

    /**
     * Основной метод программы. Запускает взаимодействие с пользователем.
     *
     * @param args аргументы командной строки (не используются в данном случае)
     */
    public static void main(String[] args) {
        Hw5_Task1 phoneBook = new Hw5_Task1();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (choice != 2) {
            System.out.println("В новой строке введите:\n1) Добавление номера" +
                    "\n2) Вывод всего");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Введите фамилию:");
                    String lastName = scanner.next();
                    System.out.println("Введите номер:");
                    String phoneNumber = scanner.next();
                    phoneBook.addNumber(lastName, phoneNumber);
                    break;
                case 2:
                    phoneBook.printAll();
                    break;
                default:
                    System.out.println("Некорректный ввод.");
            }
        }
    }
}
