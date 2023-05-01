package Lesson3;

public class myEx3 {
    public static void main(String[] args) {
        int[] a = new int[] { 1, 9 };
        int[] b = new int[3];
        System.arraycopy(a, 0, b, 0, a.length);
        for (int i : a) { System.out.printf("%d ", i);} // 1 9
        System.out.println();
        for (int j : b) { System.out.printf("%d ", j);}
        // 0 9 0 0 0 0 0 0 0 0
    }
}
