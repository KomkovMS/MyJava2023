package OOP_Hw1_Task2;


/**
 * Класс, представляющий прямоугольник.
 */
public class Rectangle {
    private double width;
    private double height;

    /**
     * Конструктор без параметров, создающий прямоугольник с шириной и высотой
     * по умолчанию.
     */
    public Rectangle() {
        this.width = 0;
        this.height = 0;
    }

    /**
     * Конструктор, создающий прямоугольник с заданной шириной и высотой.
     *
     * @param width  Ширина прямоугольника.
     * @param height Высота прямоугольника.
     */
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    /**
     * Получает ширину прямоугольника.
     *
     * @return Ширина прямоугольника.
     */
    public double getWidth() {
        return width;
    }

    /**
     * Устанавливает ширину прямоугольника.
     *
     * @param width Ширина прямоугольника.
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * Получает высоту прямоугольника.
     *
     * @return Высота прямоугольника.
     */
    public double getHeight() {
        return height;
    }

    /**
     * Устанавливает высоту прямоугольника.
     *
     * @param height Высота прямоугольника.
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Вычисляет площадь прямоугольника.
     *
     * @return Площадь прямоугольника.
     */
    public double calculateArea() {
        return width * height;
    }

    /**
     * Вычисляет периметр прямоугольника.
     *
     * @return Периметр прямоугольника.
     */
    public double calculatePerimeter() {
        return 2 * (width + height);
    }
}
