package Hw3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Пусть дан произвольный список целых чисел, удалить из него чётные числа
 */
public class Hw3_Task1 {
    public static void main(String[] args) {
        // вариант 1
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5,
                6, 123, 5432, 54265, 657, 1234, 23, 745, 2314, 324));

        for (int i = arr.size() - 1; i >= 0; i--) {
            if (arr.get(i) % 2 == 0) {
                arr.remove(i);
            }
        }
        System.out.println(arr); // [1, 3, 5, 123, 54265, 657, 23, 745]

        // вариант 2
        System.out.println("**************************");
        List<Integer> arr2 = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5,
                6, 123, 5432, 54265, 657, 1234, 23, 745, 2314, 324));

        arr.removeIf(i -> i % 2 == 0);
        System.out.println(arr); // [1, 3, 5, 123, 54265, 657, 23, 745]
    }
}
