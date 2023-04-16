package Lesson1;

public class Cycles {
    static int value = 321;
    static int count = 0;

    public static void main(String[] args) {
        // Циклы

        while (value != 0) {
            value /= 10;
            count++;
        }
        System.out.println(count); // 3

        value = 321;
        count = 0;
        do {
            value /= 10;
            count++;
        } while (value != 0);
        System.out.println(count); // 3

        count = 10;
        for (int i = 0; i < count; i++) {
            if (i % 2 == 0) continue;
            System.out.println(i);  // 1
            // 3
            // 5
            // 7
            // 9

        }

        int s = 0;
        for (int i = 1; i <= 10; i++) {
            s += i;
            System.out.println(s);
        }
        System.out.println(s);

        // Вложенные циклы
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // * * * * *
        // * * * * *
        // * * * * *
        // * * * * *
        // * * * * *

        // for :
        //Работает только для коллекций
        int arr[] = new int[10];
        for (int item : arr) {
            System.out.printf("%d ", item);
        }
        System.out.println(); // 0 0 0 0 0 0 0 0 0 0

        int[] array = new int[]{1, 2, 3, 4, 5, 6, 77};
        for (int item : array) {
            System.out.print(item); // 12345677
        }

    }
}
