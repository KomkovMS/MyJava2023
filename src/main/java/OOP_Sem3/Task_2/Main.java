package OOP_Sem3.Task_2;

public class Main {
    public static void main(String[] args) {
        I_BooleanTest IsFactor = (n, d) -> (n % d) == 0;
        int a = 10;
        int b = 2;
        if (IsFactor.BooleanTest(a, b)) {
            System.out.printf("%s является делителем %s", b, a);

        }
        System.out.println();
        if (!IsFactor.BooleanTest(a, b = 3)) {
            System.out.printf("%s НЕ является делителем %s \n", b, a);

        }

        I_BooleanTest lessNum = (y, k) -> (y < k);

        if (lessNum.BooleanTest(a = 2, b = 10)) {
            System.out.printf("%s меньше %s\n", a, b);

        }
        System.out.println();
        if (!lessNum.BooleanTest(a = 3, b = 2)) {
            System.out.printf("%s НЕ меньше %s\n", a, b);

        }
        I_BooleanTest numEqual = (r, u) -> (r < 0 ? -r : r) == (u < 0 ? -u : u);


        if (numEqual.BooleanTest(a = 4, b = -4)) {
            System.out.printf("%s равно по модулю %s\n", a, b);

        }

        if (!numEqual.BooleanTest(a = 4, b = -5)) {
            System.out.printf("%s НЕ равно по модулю %s\n", a, b);

        }
    }
}
