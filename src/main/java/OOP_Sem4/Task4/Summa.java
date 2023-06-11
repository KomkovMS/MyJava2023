package OOP_Sem4.Task4;

public class Summa {
    int sum;

    <T extends Number> Summa(T arg) {
        sum = 0;
        for (int i = 0; i < arg.intValue(); i++) {
            sum += i;
        }
    }

    int getSum() {
        return sum;
    }
}
