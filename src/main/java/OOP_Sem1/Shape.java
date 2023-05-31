package OOP_Sem1;

public class Shape {
    private double width;
    private double height;
    int i = 2;

    public Shape(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Shape() {
        this(0, 0);
    }

    public Shape(double x) {
        this(x, x);
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }


    void showShape() {
        System.out.printf("Ширина: %f, Высота: %f\n", width, height);
    }
}