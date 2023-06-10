package OOP_Hw1.OOP_Hw1_Task1;

/**
 * Класс, представляющий владельца кота.
 */
public class Owner {
    private String name;

    /**
     * Конструктор класса.
     *
     * @param name Имя владельца.
     */
    public Owner(String name) {
        this.name = name;
    }

    /**
     * Получает имя владельца.
     *
     * @return Имя владельца.
     */
    public String getName() {
        return name;
    }

    /**
     * Устанавливает имя владельца.
     *
     * @param name Имя владельца.
     */
    public void setName(String name) {
        this.name = name;
    }
}
