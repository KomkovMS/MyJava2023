package Lesson1;

public class FormattedOutput {
    public static void main(String[] args) {
        // Форматированный вывод
        int a = 1, b = 2;
        int c = a + b;
        String res = a + " + " + b + " = " + c; // a + b = c
        System.out.println(res); // 1 + 2 = 3

        String s = "qwe";
        int f = 123;
        String q = s + f;
        System.out.println(q); // qwe123

        int aa = 1, bb = 2;
        int cc = aa + bb;
        String res2 = String.format("%d + %d = %d \n", aa, bb, cc);
        System.out.printf("%d + %d = %d \n", aa, bb, cc);   // 1 + 2 = 3
        System.out.println(res2);   // 1 + 2 = 3

        // виды спецификаторов
//        %d: целочисленных значений
//        %x: для вывода шестнадцатеричных чисел
//        %f: для вывода чисел с плавающей точкой
//        %e: для вывода чисел в экспоненциальной форме,
//        например, 3.1415e+01
//        %c: для вывода одиночного символа
//        %s: для вывода строковых значений

        float pi = 3.1415f;
        System.out.printf("%f\n", pi); // 3,141500
        System.out.printf("%.2f\n", pi); // 3,14
        System.out.printf("%.3f\n", pi); // 3,141
        System.out.printf("%e\n", pi); // 3,141500e+00
        System.out.printf("%.2e\n", pi); // 3,14e+00
        System.out.printf("%.3e\n", pi); // 3,141e+00


    }
}
