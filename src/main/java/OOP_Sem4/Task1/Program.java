package OOP_Sem4.Task1;

public class Program {
    public static void main(String[] args) {
        Gen<Integer, String> iOb = new Gen<Integer, String>(88, "строRа");
        iOb.showType();
        int v = iOb.getOb();
        System.out.println("Значение v = " + v);

        String str = iOb.getOb2();
        System.out.println("Значение str = " + str);
    }
}
