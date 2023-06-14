package OOP_Hw6.Task2;

import static OOP_Hw4.Task2.GenericMethodExample.printArray;


/*
Задача 2 : Напишите обобщенный метод printArray, который принимает массив любого
типа и выводит его элементы на консоль.
В этом примере мы объявляем обобщенный метод printArray, который принимает
массив типа T. Затем мы используем цикл for-each, чтобы пройти по всем элементам
массива и вывести их на консоль.

В методе main мы создаем массивы типов Integer и String и вызываем printArray
для каждого из них.
В результате мы получаем вывод на консоль элементов каждого массива.

Таким образом, обобщенные методы позволяют нам создавать код, который может
работать с разными типами данных, обеспечивая повторное использование и
гибкость.

Полезные материалы
https://metanit.com/java/tutorial/3.11.php
 */

public class Main {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] stringArray = {"ДЗ-4 Задание 2"};

        System.out.println("Печать числового массива: ");
        ArrayPrinter<Integer> integerPrinter = new IntegerArrayPrinter();
        integerPrinter.printArray(intArray);

        System.out.println("Печать строкового массива: ");
        ArrayPrinter<String> stringPrinter = new StringArrayPrinter();
        stringPrinter.printArray(stringArray);
    }
}
