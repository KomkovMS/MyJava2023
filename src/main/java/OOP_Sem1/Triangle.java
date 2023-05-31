package OOP_Sem1;

public class Triangle extends Shape {
    String style;
    int i = 3;
    public Triangle(double width, double height, String style) {
        super(width, height);
        this.style = style;
    }
    public Triangle(){
        super();
        this.style = "none";
    }
    public Triangle(double width, String style){
        super(width);
        this.style = style;
    }
    double area() {
        return getWidth() * getHeight() / 2;
    }


    void showStyle() {
        System.out.println(style);
    }

    @Override
    void showShape() {
        System.out.printf("Гипотенуза: %f\n", Math.sqrt(getWidth() * getWidth() + getHeight() * getHeight()));
    }

    void showI(){
        System.out.println(i + " " + super.i);
    }
}