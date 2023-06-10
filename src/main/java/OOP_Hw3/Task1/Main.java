package OOP_Hw3.Task1;

/*
Урок 2 задание 2:
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
        /*
        Урок 3 задание 1:
        В предыдущем ДЗ добавить реализацию собственного функционального
        интерфейса. В первом варианте вам нужно добавить реализацию собственного
        функционального интерфейса к предыдущему ДЗ. Вы можете выбрать любой
        класс или часть кода из предыдущего ДЗ и добавить свой собственный
        функциональный интерфейс, описывающий необходимое поведение.
        */

        // Создаем объект I_PersonProcessor и передаем его в метод
        // processAllPersons

        I_PersonProcessor processor = person -> System.out.println("Обработка: "
                + person);
        ((Market) market).processAllPersons(processor);
    }
}