package OOP_Hw4.Task2;

/**
 * Пример использования обобщенного метода printArray для вывода элементов
 * массива любого типа.
 */
public class GenericMethodExample {
    /**
     * Обобщенный метод, который принимает массив любого типа и выводит его
     * элементы в консоль.
     *
     * @param array массив элементов любого типа
     * @param <T>   обобщенный тип элементов массива
     */
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }
}
