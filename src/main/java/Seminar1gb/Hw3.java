package Seminar1gb;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в
массив m1
 */
public class Hw3 {
    public static void main(String[] args) {
        short n = 3; // заданное число
        short i = 1; // начало диапазона
        short[] m1 = new short[(Short.MAX_VALUE / n) + 1]; // создание массива для хранения кратных чисел
        int index = 0; // индекс текущей ячейки в массиве

        for (short num = i; num <= Short.MAX_VALUE; num++) {
            if (num % n == 0) {
                m1[index] = num; // добавление кратного числа в массив
                index++; // увеличение индекса
            }
        }
        System.out.println(Arrays.toString(Arrays.copyOfRange(m1, 0, index)));

    }
}
