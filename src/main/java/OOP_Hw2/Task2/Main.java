package OOP_Hw2.Task2;

/*
2)Реализовать класс Market и все его обязательные методы. Этот класс должен
реализовывать методы из интерфейса QueueBehaviour, которые имитируют работу
очереди. Кроме того, класс должен содержать методы, соответствующие интерфейсу
MarketBehaviour, которые добавляют и удаляют людей из очереди, а также метод
update, который обновляет состояние магазина путем принятия и отдачи заказов.
 */
public class Main {
    public static void main(String[] args) {
        I_MarketBehaviour market = new Market();
        market.addPerson("Максим");
        market.addPerson("Ирина");
        System.out.println("Размер очереди: " + market.size());
        System.out.println("Следующий человек: " + market.removePerson());

    }
}