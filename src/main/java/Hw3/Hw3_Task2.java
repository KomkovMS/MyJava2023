package Hw3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

/*
Задан целочисленный список ArrayList.
Найти минимальное, максимальное и среднее из этого списка (написать функции)

 */
public class Hw3_Task2 {

    /**
     * Метод для нахождения минимального значения в списке целых чисел.
     *
     * @param arr список целых чисел, в котором необходимо найти минимальное
     *            значение
     * @return минимальное значение в списке целых чисел
     */
    static int findMinValue(ArrayList<Integer> arr) {
        int numMin = arr.get(0);
        for (int num : arr) {
            if (num < numMin) {
                numMin = num;
            }
        }
        return numMin;
    }

    /**
     * Метод для нахождения максимального значения в списке целых чисел.
     *
     * @param arr список целых чисел, в котором необходимо найти максимальное
     *            значение
     * @return максимальное значение в списке целых чисел
     */
    static int findMaxValue(ArrayList<Integer> arr) {
        int numMax = arr.get(0);
        for (int num : arr) {
            if (num > numMax) {
                numMax = num;
            }
        }
        return numMax;
    }

    /**
     * Метод для нахождения среднего значения в списке целых чисел.
     *
     * @param arr список целых чисел, в котором необходимо найти среднее
     *            значение
     * @return среднее значение в списке целых чисел
     */
    static int findAverageValue(ArrayList<Integer> arr) {
        int numSum = 0;
        int result = 0;
        for (int number : arr) {
            numSum += number;
        }
        result = numSum / arr.size();
        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5,
                6, -123, 5432, 54265, 657, 1234, 23, 745, 2314, -324));
        Integer numberMin = findMinValue(arr);
        System.out.println(numberMin);                  //-324
        Integer numberMax = findMaxValue(arr);
        System.out.println(numberMax);                  //54265
        Integer averageValue = findAverageValue(arr);
        System.out.println(averageValue);               //4015
    }
}

