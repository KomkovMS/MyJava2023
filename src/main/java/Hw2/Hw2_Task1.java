package Hw2;

import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/*
Реализуйте алгоритм сортировки пузырьком числового массива (введён вами),
результат после каждой итерации запишите в лог-файл.
 */

public class Hw2_Task1 {

    public static void main(String[] args) {
        int[] arr = {1, 56, 3, 25, 19, 4, 98, 7};

        Logger logger = Logger.getLogger("BubbleSortLog");
        FileHandler fh;
        try {
            fh = new FileHandler("BubbleSortLog.log");
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);
        } catch (Exception e) {
            e.printStackTrace();
        }

        logger.info("Несортированный массив: " + Arrays.toString(arr));

        bubbleSort(arr, logger);

        logger.info("Сортированный массив: " + Arrays.toString(arr));
    }

    /**
     * Сортирует заданный массив методом пузырька.
     *
     * @param arr    массив, который нужно отсортировать
     * @param logger объект логгера, используемый для записи отладочных
     *               сообщений в лог-файл
     */
    public static void bubbleSort(int[] arr, Logger logger) {
        int n = arr.length; // Переменная n содержит размер массива
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            logger.info("Иттерация " + (i + 1) + ": " +
                    Arrays.toString(arr));
            if (!swapped) {
                break;
            }
        }
    }
}
