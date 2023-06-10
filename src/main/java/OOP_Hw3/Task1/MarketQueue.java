package OOP_Hw3.Task1;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Класс MarketQueue реализует интерфейс I_Queue и представляет собой
 * очередь покупателей.
 */
public class MarketQueue implements I_Queue {
    private Queue<String> queue;

    /**
     * Конструктор класса MarketQueue.
     * Инициализирует внутреннюю очередь типа Queue.
     */
    public MarketQueue() {
        queue = new LinkedList<>();
    }

    /**
     * Добавляет элемент в конец очереди.
     *
     * @param person элемент для добавления в очередь.
     */
    @Override
    public void enqueue(String person) {
        queue.add(person);
    }

    /**
     * Удаляет и возвращает элемент из начала очереди.
     *
     * @return элемент из начала очереди.
     */
    @Override
    public String dequeue() {
        return queue.poll();
    }

    /**
     * Проверяет, является ли очередь пустой.
     *
     * @return true, если очередь пуста, false в противном случае.
     */
    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    /**
     * Возвращает текущий размер очереди.
     *
     * @return размер очереди.
     */
    @Override
    public int size() {
        return queue.size();
    }
}
