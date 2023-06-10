package OOP_Hw3.Task1;

/**
 * Интерфейс I_MarketBehaviour определяет методы, специфичные для магазина.
 */
public interface I_MarketBehaviour extends I_Queue {
    void addPerson(String person);
    String removePerson();
    void update();
}