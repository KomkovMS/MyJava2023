package OOP_Hw4.Task4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Класс DataContainer представляет собой контейнер для хранения и обработки
 * данных.
 *
 * @param <T> тип элементов контейнера
 */
public class DataContainer<T> {
    private List<T> elements;

    /**
     * Создает новый экземпляр DataContainer.
     */
    public DataContainer() {
        elements = new ArrayList<>();
    }

    /**
     * Добавляет элемент в контейнер.
     *
     * @param element элемент для добавления
     */
    public void add(T element) {
        elements.add(element);
    }

    /**
     * Возвращает элемент по заданному индексу.
     *
     * @param index индекс элемента
     * @return элемент по индексу
     */
    public T get(int index) {
        return elements.get(index);
    }

    /**
     * Сортирует элементы контейнера с использованием заданного компаратора.
     *
     * @param comparator компаратор для сортировки элементов
     */
    public void sort(Comparator<? super T> comparator) {
        Collections.sort(elements, comparator);
    }

    /**
     * Выводит элементы контейнера на консоль.
     */
    public void print() {
        for (T element : elements) {
            System.out.println(element);
        }
    }
}
