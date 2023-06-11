package OOP_Sem4.Task2;

public class Program {
    Nameric<Integer> a = new Nameric<Integer>(5);

    public static void main(String[] args) {
        Nameric<Integer> a = new Nameric<Integer>(5);
        System.out.println("Обратная величина a = 1 / a = " + a.dubReturn());
        System.out.println("Дробная часть a = " + a.dubRestReturn());

        Nameric<Double> b = new Nameric<Double>(8.6);
        System.out.println("Обратная величина b = 1 / b = " + b.dubReturn());
        System.out.printf("Дробная часть b = %.2f\n", b.dubRestReturn());

        Nameric<Float> c = new Nameric<Float>(845.6f);
        Nameric<Double> d = new Nameric<Double>(-1.24);
        Nameric<Integer> e = new Nameric<Integer>(-5);
        Nameric<Long> l = new Nameric<Long>(-5L);

        if (d.absEqual(c)) {
            System.out.println("Абсолютные значения совпадают");
        }
        else System.out.println("Абсолютные значения не совпадают");

        if (e.absEqual(l)) {
            System.out.println("Абсолютные значения совпадают");
        }
        else System.out.println("Абсолютные значения не совпадают");
    }
}
