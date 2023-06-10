package OOP_Hw1.OOP_Hw1_Task2;

/*
Задача 2:
Реализуйте класс "Прямоугольник" (Rectangle), который имеет свойства ширина
(width) и высота (height). Класс должен обладать следующими методами:

Конструктор без параметров, который создает прямоугольник с шириной и высотой
по умолчанию.
Конструктор, который принимает значения ширины и высоты и создает прямоугольник
с заданными значениями.
Методы доступа (геттеры и сеттеры) для свойств ширины и высоты.
Метод "вычислить площадь" (calculateArea), который возвращает площадь
прямоугольника (ширина * высота).
Метод "вычислить периметр" (calculatePerimeter), который возвращает периметр
прямоугольника (2 * (ширина + высота)).
 */

/**
 * Главный класс программы, демонстрирующий использование
 * класса "Прямоугольник".
 */
public class Main {
    /**
     * Точка входа в программу.
     *
     * @param args Аргументы командной строки
     */
    public static void main(String[] args) {
        // Создание прямоугольника с шириной и высотой по умолчанию
        Rectangle rectangle1 = new Rectangle();
        System.out.println("Ширина: " + rectangle1.getWidth());
        System.out.println("Высота: " + rectangle1.getHeight());
        System.out.println("Площадь: " + rectangle1.calculateArea());
        System.out.println("Периметр: " + rectangle1.calculatePerimeter());

        // Создание прямоугольника с заданной шириной и высотой
        Rectangle rectangle2 = new Rectangle(5.0, 3.0);
        System.out.println("Ширина: " + rectangle2.getWidth());
        System.out.println("Высота: " + rectangle2.getHeight());
        System.out.println("Площадь: " + rectangle2.calculateArea());
        System.out.println("Периметр: " + rectangle2.calculatePerimeter());

        // Изменение свойств прямоугольника
        rectangle2.setWidth(7.0);
        rectangle2.setHeight(4.0);
        System.out.println("Ширина: " + rectangle2.getWidth());
        System.out.println("Высота: " + rectangle2.getHeight());
        System.out.println("Площадь: " + rectangle2.calculateArea());
        System.out.println("Периметр: " + rectangle2.calculatePerimeter());
    }
}
