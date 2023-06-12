package OOP_Hw4.Task4;

/*
Задача 4. Напишите обобщенный класс DataContainer, который представляет собой
контейнер для хранения и обработки данных. Класс должен иметь методы для
добавления и получения элементов, а также методы для сортировки и вывода
элементов.

В этом примере мы создаем обобщенный класс DataContainer, который использует
массив для хранения элементов типа T. Класс имеет методы add для добавления
элементов, get для получения элемента по индексу, sort для сортировки элементов
с помощью переданного компаратора, и print для вывода элементов на консоль.

В методе main мы создаем объект DataContainer для хранения строк. Мы добавляем
несколько строк, выводим их на консоль с помощью метода print, затем сортируем
элементы в обратном порядке с помощью лямбда-выражения в методе sort и снова
выводим отсортированные элементы на консоль.

Таким образом, обобщенные классы позволяют нам создавать универсальные
контейнеры для хранения и обработки данных любого типа, обеспечивая безопасность
типов и гибкость в использовании.
 */


public class Main {
    public static void main(String[] args) {
        DataContainer<String> container = new DataContainer<>();
        container.add("Диск");
        container.add("Мышка");
        container.add("Клавиатура");
        container.add("Янтарь");
        container.add("Монитор");
        container.add("Принтер");
        container.add("Шлем");

        System.out.println("Первоначальный список: ");
        container.print();

        // Сортировка в обратном порядке
        container.sort((a, b) -> b.compareTo(a));

        System.out.println("Отсортировано в обратном порядке :");
        container.print();
    }
}