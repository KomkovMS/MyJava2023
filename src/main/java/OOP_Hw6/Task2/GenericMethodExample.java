package OOP_Hw6.Task2;

/**
 * Пример использования обобщенного метода printArray для вывода элементов
 * массива любого типа.
 */
public class GenericMethodExample<T> implements ArrayPrinter<T> {

    public void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }
}
