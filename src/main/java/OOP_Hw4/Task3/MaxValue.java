package OOP_Hw4.Task3;

/**
 * Обобщенный класс для получения максимального значения из двух значений.
 * @param <T> тип данных, ограниченный интерфейсом Comparable
 */
public class MaxValue<T extends Comparable<T>> {
    /**
     * Метод для получения максимального значения из двух.
     * @param a первое значение
     * @param b второе значение
     * @return максимальное значение из двух
     */
    public T getMax(T a, T b) {
        return a.compareTo(b) >= 0 ? a : b;
    }
}
