package OOP_Sem1;

public class Main {
    public static void main(String[] args) {
        Triangle t1 = new Triangle(10, 20, "green");
        Triangle t2 = new Triangle(15, "blue");
        Triangle t3 = new Triangle();

        t1.showShape();
        t2.showShape();
        t3.showShape();


        t3.showI();
    }
}
