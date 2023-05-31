package Hw6;

/**
 * Класс, представляющий ноутбук.
 */
public class NoteBook {
    private String model;
    private int ram;
    private int hdd;
    private String operatingSystem;
    private String color;

    /**
     * Конструктор класса NoteBook.
     *
     * @param model            модель ноутбука
     * @param ram              объем оперативной памяти (в гигабайтах)
     * @param hdd              объем жесткого диска (в гигабайтах)
     * @param operatingSystem  операционная система
     * @param color            цвет ноутбука
     */
    public NoteBook(String model, int ram, int hdd, String operatingSystem,
                    String color) {
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
        this.operatingSystem = operatingSystem;
        this.color = color;
    }

    /**
     * Метод для получения модели ноутбука.
     *
     * @return модель ноутбука
     */
    public String getModel() {
        return model;
    }

    /**
     * Метод для получения объема оперативной памяти ноутбука.
     *
     * @return объем оперативной памяти (в гигабайтах)
     */
    public int getRam() {
        return ram;
    }

    /**
     * Метод для получения объема жесткого диска ноутбука.
     *
     * @return объем жесткого диска (в гигабайтах)
     */
    public int getHdd() {
        return hdd;
    }

    /**
     * Метод для получения операционной системы ноутбука.
     *
     * @return операционная система
     */
    public String getOperatingSystem() {
        return operatingSystem;
    }

    /**
     * Метод для получения цвета ноутбука.
     *
     * @return цвет ноутбука
     */
    public String getColor() {
        return color;
    }

    /**
     * Переопределение метода toString() для удобного вывода информации
     * о ноутбуке.
     *
     * @return строковое представление ноутбука
     */
    @Override
    public String toString() {
        return "Model: " + model +
                ", RAM: " + ram + "GB" +
                ", HDD: " + hdd + "GB" +
                ", OS: " + operatingSystem +
                ", Color: " + color;
    }
}
