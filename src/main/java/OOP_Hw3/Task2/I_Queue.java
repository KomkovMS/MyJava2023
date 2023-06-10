package OOP_Hw3.Task2;

/**
 * Интерфейс I_Queue определяет методы для работы с очередью.
 */
public interface I_Queue {
    void enqueue(String person);
    String dequeue();
    boolean isEmpty();
    int size();
}
