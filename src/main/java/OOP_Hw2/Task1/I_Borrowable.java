package OOP_Hw2.Task1;

// Task1
/**
 * Интерфейс для работы с выдаваемыми объектами.
 */
public interface I_Borrowable {
    /**
     * Метод для выдачи объекта.
     */
    void borrow();

    /**
     * Метод для возврата объекта.
     */
    void returnBook();
}