package OOP_Hw3.Task3;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Класс для сортировки списка объектов с использованием компаратора.
 */
public class ObjectSorter {

    /**
     * Сортирует список объектов по заданному критерию с использованием
     * компаратора.
     *
     * @param objects    Список объектов для сортировки.
     * @param comparator Компаратор для сравнения объектов.
     * @param <T>        Тип объектов в списке.
     */
    public static <T> void sort(List<T> objects, Comparator<T> comparator) {
        Collections.sort(objects, comparator);
    }
}