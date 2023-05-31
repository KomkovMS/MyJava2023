package Hw6;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Главный класс приложения, отвечающий за выполнение фильтрации ноутбуков.
 */
public class Main {
    public static void main(String[] args) {
        Set<NoteBook> notebooks = new HashSet<>();
        notebooks.add(new NoteBook("Lenovo ThinkPad X1 Carbon", 16,
                512, "Windows 10", "Black"));
        notebooks.add(new NoteBook("Apple MacBook Pro", 16,
                512, "macOS", "Silver"));
        notebooks.add(new NoteBook("Dell XPS 15", 32,
                1000, "Windows 10", "White"));
        notebooks.add(new NoteBook("HP Spectre x360", 8,
                256, "Windows 10", "Gold"));
        notebooks.add(new NoteBook("Asus ROG Zephyrus G14", 16,
                512, "Windows 11", "White"));
        notebooks.add(new NoteBook("Acer Predator Helios 300", 16,
                512, "Windows 10", "Black"));
        notebooks.add(new NoteBook("Microsoft Surface Laptop 4", 8,
                256, "Windows 10", "Platinum"));
        notebooks.add(new NoteBook("Razer Blade 15", 16,
                1000, "Windows 10", "White"));
        notebooks.add(new NoteBook("Lenovo Yoga C940", 16,
                512, "Windows 11", "Grey"));
        notebooks.add(new NoteBook("Apple MacBook", 8,
                256, "macOS", "Silver"));

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите цифру, соответствующую необходимому " +
                "критерию:");
        System.out.println("1 - ОЗУ");
        System.out.println("2 - Объем ЖД");
        System.out.println("3 - Операционная система");
        System.out.println("4 - Цвет");

        int criteria = scanner.nextInt();
        scanner.nextLine();

        switch (criteria) {
            case 1:
                System.out.print("Введите минимальный объем ОЗУ: ");
                int minRAM = scanner.nextInt();
                scanner.nextLine();
                notebooks = FilterUtils.filterByRAM(notebooks, minRAM);
                break;
            case 2:
                System.out.print("Введите минимальный объем ЖД: ");
                int minHDD = scanner.nextInt();
                scanner.nextLine();
                notebooks = FilterUtils.filterByHDD(notebooks, minHDD);
                break;
            case 3:
                System.out.print("Введите операционную систему: ");
                String operatingSystem = scanner.nextLine();
                notebooks = FilterUtils.filterByOperatingSystem(notebooks,
                        operatingSystem);
                break;
            case 4:
                System.out.print("Введите цвет: ");
                String color = scanner.nextLine();
                notebooks = FilterUtils.filterByColor(notebooks, color);
                break;
            default:
                System.out.println("Некорректный выбор критерия.");
                return;
        }

        System.out.println("\nРезультаты фильтрации:");
        if (notebooks.isEmpty()) {
            System.out.println("Ноутбуки по заданным критериям не найдены.");
        } else {
            for (NoteBook notebook : notebooks) {
                System.out.println(notebook);
            }
        }
    }
}
