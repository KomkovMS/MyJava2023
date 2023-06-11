package OOP_Sem4.Task3;

public class Program {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        Gen<A> g = new Gen<A>(a);
        Gen<B> gb = new Gen<B>(b);
        Gen<C> gc = new Gen<C>(c);
        Gen<D> gd = new Gen<D>(d);

        test(g);
        //test(gb);
        test(gc);
        // test(gd);
    }

//    static void test(Gen<? extends A> o) {
//        //
//    }

    static void test(Gen<? super C> o) {
        //
    }
}
