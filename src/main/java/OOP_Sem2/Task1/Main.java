package OOP_Sem2.Task1;

public class Main {

    public static void main(String[] args) {
        Numeric n = new Numeric();
        for (int i = 0; i < 5; i++) {
            System.out.printf("Следующее значение: %d\n", n.getNext());
        }

        System.out.println("Сброс");
        n.reset();
        for (int i = 0; i < 5; i++) {
            System.out.printf("Следующее значение: %d\n", n.getNext());
        }
        System.out.println("Начальное значение 100");

        n.setStart(100);
        for (int i = 0; i < 5; i++) {
            System.out.printf("Следующее значение: %d\n", n.getNext());
        }
    }
}
