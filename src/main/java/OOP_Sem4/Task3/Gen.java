package OOP_Sem4.Task3;

public class Gen<T> {
    T obj;
    Gen(T o) {
        obj = o;
    }

    static void test(Gen<? extends A> o) {
        //
    }
}
