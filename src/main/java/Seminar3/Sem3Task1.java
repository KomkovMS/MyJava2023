package Seminar3;

import java.util.*;

/*
Заполнить список десятью случайными числами.
Отсортировать список методом sort() и вывести его на экран
 */
public class Sem3Task1 {
    public static void main(String[] args) {
        final int n = 10;
        ArrayList<Integer> list = new ArrayList<Integer>();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            list.add(random.nextInt(0, 100));
        }
        System.out.println("Before sorting: " + list);

        list.sort(null); // или
        // Collections.sort(list);

        System.out.println("After sorting: " + list);

    }
}
