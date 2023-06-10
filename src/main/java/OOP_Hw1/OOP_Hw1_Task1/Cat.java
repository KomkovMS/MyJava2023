package OOP_Hw1.OOP_Hw1_Task1;

/**
 * Класс, представляющий кота.
 */
public class Cat {
    private String name;
    private int age;
    private Owner owner;

    /**
     * Конструктор класса.
     *
     * @param name Имя кота.
     * @param age Возраст кота.
     */
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Получает имя кота.
     *
     * @return Имя кота.
     */
    public String getName() {
        return name;
    }

    /**
     * Устанавливает имя кота.
     *
     * @param name Имя кота.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Получает возраст кота.
     *
     * @return Возраст кота.
     */
    public int getAge() {
        return age;
    }

    /**
     * Устанавливает возраст кота.
     *
     * @param age Возраст кота.
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Получает владельца кота.
     *
     * @return Владелец кота.
     */
    public Owner getOwner() {
        return owner;
    }

    /**
     * Устанавливает владельца кота.
     *
     * @param owner Владелец кота.
     */
    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    /**
     * Выводит приветствие кота в консоль.
     */
    public void greet() {
        String ownerName;
        if (owner != null) {
            ownerName = owner.getName();
        } else {
            ownerName = "неизвестный владелец";
        }
        System.out.println("Мяу! Меня зовут " + name + ". Мне " + age +
                " года(лет). Мой владелец - " + ownerName + ".");
    }
}
