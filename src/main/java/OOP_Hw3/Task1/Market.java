package OOP_Hw3.Task1;

/**
 * Класс Market реализует интерфейс I_MarketBehaviour и представляет собой
 * магазин.
 */
public class Market implements I_MarketBehaviour {
    private MarketQueue queue;

    /**
     * Конструктор класса Market.
     * Инициализирует внутреннюю очередь типа MarketQueue.
     */
    public Market() {
        queue = new MarketQueue();
    }

    /**
     * Добавляет элемент в конец очереди.
     *
     * @param person элемент для добавления в очередь.
     */
    @Override
    public void enqueue(String person) {
        queue.enqueue(person);
    }

    /**
     * Удаляет и возвращает элемент из начала очереди.
     *
     * @return элемент из начала очереди.
     */
    @Override
    public String dequeue() {
        return queue.dequeue();
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
     * Добавляет человека в конец очереди.
     *
     * @param person имя человека для добавления в очередь.
     */
    @Override
    public void addPerson(String person) {
        enqueue(person);
    }

    /**
     * Удаляет и возвращает следующего человека из очереди.
     *
     * @return имя следующего человека из очереди.
     */
    @Override
    public String removePerson() {
        return dequeue();
    }

    /**
     * Обновляет состояние магазина.
     *
     */
    @Override
    public void update() {
        // Реализация обновления состояния магазина
    }

    // Добавление нового метода, использующего интерфейс I_PersonProcessor
    public void processAllPersons(I_PersonProcessor processor) {
        while (!isEmpty()) {
            String person = removePerson();
            processor.processPerson(person);
        }
    }
}
