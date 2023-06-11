package OOP_Sem4.Task2;


import OOP_Sem2.Task1.Numeric;

public class Nameric<T extends Number> {
    T num;

    Nameric(T n) {
        num = n;
    }

    double dubReturn() {
        return 1 / num.doubleValue();
    }

    double dubRestReturn() {
        return num.doubleValue() - num.intValue();
    }

    boolean absEqual(Nameric<?> a) { // Шаблон аргумента
        if (Math.abs(num.doubleValue()) == Math.abs(a.num.doubleValue())) {
            return true;
        } else {
            return false;
        }
    }

}
