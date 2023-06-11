package OOP_Sem4.Task1;

public class Gen<T, R> {
    T ob;
    R ob2;

    Gen(T o, R o2) {
        ob = o;
        ob2 = o2;
    }

    T getOb() {
        return ob;
    }

    R getOb2() {
        return ob2;
    }

    void showType() {
        System.out.println("Тип T - это " + ob.getClass().getName());
        System.out.println("Тип R - это " + ob2.getClass().getName());
    }
}
