package OOP_Hw3.Task3;

import java.util.Comparator;


/**
 * Компаратор для сравнения объектов.
 */
public class ObjectComparator<T> implements Comparator<T>{
    private final Comparator<T> comparator;

    /**
     * Конструктор, принимающий компаратор.
     *
     * @param comparator Компаратор для сравнения объектов.
     */
    public ObjectComparator(Comparator<T> comparator) {
        this.comparator = comparator;
    }

    /**
     * Сравнивает два объекта с использованием переданного компаратора.
     *
     * @param obj1 Первый объект для сравнения.
     * @param obj2 Второй объект для сравнения.
     * @return Результат сравнения.
     */
    @Override
    public int compare(T obj1, T obj2) {
        return comparator.compare(obj1, obj2);
    }
}
