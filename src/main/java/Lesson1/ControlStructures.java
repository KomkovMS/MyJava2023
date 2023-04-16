package Lesson1;

public class ControlStructures {
    // Управляющие конструкции
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c;
        if (a > b) {
            c = a;
        } else {
            c = b;
        }
        System.out.println(c); // 2

        // или
        int aa = 1;
        int bb = 2;
        int cc = 0;
        if (aa > bb) cc = aa;
        if (bb > aa) cc = bb;
        System.out.println(cc); // 2

        int f = 1;
        int g = 2;
        int min = f < g ? f : g;
        System.out.println(min);    // 1
    }
}
