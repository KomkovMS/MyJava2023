package OOP_Hw6.Task1;

/**
 * Класс, содержащий обобщенные методы для печати элементов.
 */
public class Printer {
    /**
     * Выводит элемент на консоль.
     *
     * @param <T>      тип элемента
     * @param element  элемент для вывода
     */
    public static <T> void printElement(T element) {
        System.out.println(element);
    }
}
