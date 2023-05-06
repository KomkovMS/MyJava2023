package Hw4;

import java.util.LinkedList;

/*
2) Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди,
dequeue() - возвращает первый элемент из очереди и удаляет его,
first() - возвращает первый элемент из очереди, не удаляя.

Пример:
[1, 2, 3, 4, 5, 6, 7]
spisok.enqueue(8)
[1, 2, 3, 4, 5, 6, 7,8]
spisok.dequeue
1
[2, 3, 4, 5, 6, 7,8]
spisok.first()
2
[2, 3, 4, 5, 6, 7,8]
 */
public class Hw4_Task2 {

    public static class Queue {
        private LinkedList<Integer> queue;

        /**
         * Конструктор создает новый объект LinkedList
         */
        public Queue() {
            queue = new LinkedList<Integer>();
        }

        /**
         * Добавляет элемент в конец очереди и выводит содержимое очереди после
         * добавления.
         *
         * @param element элемент, который нужно добавить в очередь
         */
        public void enqueue(int element) {
            queue.addLast(element);
            System.out.println(queue);
        }

        /**
         * Удаляет первый элемент из очереди, выводит его значение и содержимое
         * очереди после удаления.
         *
         * @return значение первого элемента очереди
         */
        public int dequeue() {
            int first = queue.removeFirst();
            System.out.println(first);
            System.out.println(queue);
            return first;
        }

        /**
         * Возвращает первый элемент очереди без его удаления и выводит его
         * значение и содержимое очереди.
         *
         * @return значение первого элемента очереди
         */
        public int first() {
            int first = queue.getFirst();
            System.out.println(first);
            System.out.println(queue);
            return first;
        }
    }

    public static void main(String[] args) {
        Queue spisok = new Queue();
        spisok.enqueue(1);
        spisok.enqueue(2);
        spisok.enqueue(3);
        spisok.enqueue(4);
        spisok.enqueue(5);
        spisok.enqueue(6);
        spisok.enqueue(7);
        spisok.enqueue(8);
        spisok.dequeue();
        spisok.first();
        spisok.dequeue();
        spisok.first();
        spisok.dequeue();
    }
}
