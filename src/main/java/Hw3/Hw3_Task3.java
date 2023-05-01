package Hw3;

import java.util.Arrays;

/*
Реализовать алгоритм сортировки слиянием (использовать рекурсию)
 */
public class Hw3_Task3 {

    /**
     * Рекурсивный метод сортировки слиянием.
     *
     * @param arr Массив целых чисел для сортировки
     * @return Отсортированный массив целых чисел
     */
    public static int[] mergeSort(int[] arr) {
        /*
        Если массив содержит только один элемент, то он уже отсортирован,
        поэтому возвращаем его.
         */
        if (arr.length <= 1) {
            return arr;
        }

        /*
        Разбиваем массив на две части
         */
        int[] left = new int[arr.length / 2];
        int[] right = new int[arr.length - left.length];

        System.arraycopy(arr, 0, left, 0, left.length);
        System.arraycopy(arr, left.length, right, 0, right.length);

        //рекурсивно вызываем метод сортировки слиянием для каждой части массива
        left = mergeSort(left);
        right = mergeSort(right);

        return merge(left, right);
    }

    /**
     * Метод слияния двух массивов целых чисел.
     *
     * @param left  Левый отсортированный массив
     * @param right Правый отсортированный массив
     * @return Результирующий отсортированный массив
     */
    private static int[] merge(int[] left, int[] right) {
        // размер нового массива равен сумме размеров двух исходных массивов
        int[] result = new int[left.length + right.length];

        int i = 0;
        int j = 0;
        int k = 0;

        /*
        Сравниваем первые элементы двух исходных массивов и добавляем в новый
        массив наименьший из них
         */
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }

        while (i < left.length) {
            result[k++] = left[i++];
        }

        while (j < right.length) {
            result[k++] = right[j++];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, -123, 5432, 54265, 657, 1234, 23, 745,
                2314, -324};
        arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));
        // [-324, -123, 0, 1, 2, 3, 4, 5, 6, 23, 657, 745, 1234, 2314, 5432, 54265]
    }
}
