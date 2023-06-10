package OOP_Hw3.Task2;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Класс MarketQueue реализует интерфейс I_Queue и представляет собой
 * очередь покупателей.
 */
public class MarketQueue implements I_Queue, Comparable<String> {
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

    /**
     * метод compareTo сравнивает размер текущей очереди с размером другой
     * очереди, переданной в виде строки. Если размер текущей очереди меньше,
     * метод возвращает -1. Если размер текущей очереди больше, метод
     * возвращает 1. Если размеры очередей равны, метод возвращает 0
     */
    @Override
    public int compareTo(String otherQueue) {
        int sizeDiff = size() - otherQueue.length();
        if (sizeDiff < 0) {
            return -1;
        } else if (sizeDiff > 0) {
            return 1;
        } else {
            return 0;
        }
    }
}
