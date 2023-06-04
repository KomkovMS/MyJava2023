package OOP_Hw2.Task1;

// Task1
/**
 * Интерфейс для управления каталогом.
 */
public interface I_Manageable {
    /**
     * Метод для добавления новой записи.
     */
    void add();

    /**
     * Метод для удаления записи по индексу.
     *
     * @param index индекс записи
     */
    void remove(int index);
}

