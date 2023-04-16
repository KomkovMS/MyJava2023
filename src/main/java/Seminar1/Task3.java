package Seminar1;

import java.util.Arrays;
import java.util.Random;

/*
Дан массив nums = [3,2,4,3,2,5,3] и число val = 3.
Если в массиве есть числа, равные заданному, нужно перенести эти элементы в
конец массива.
Таким образом, первые несколько (или все) элементов массива должны быть отличны
от заданного, а остальные - равны ему.
Не создаём доп.массив
Пример:
[2,4,2,5,3,3,3]
 */
public class Task3 {
    public static void main(String[] args) {
        int[] nums = new int[]{3, 2, 4, 3, 2, 5, 3};
        System.out.println(Arrays.toString(nums));
        int val = 3;

        int j = nums.length - 1;
        for (int i = 0; i < j; i++) {
            if (nums[i] == val) {
                while (j > i && nums[j] == val) {
                    j--;
                }
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j--;
            }
        }

        System.out.println(Arrays.toString(nums));
        System.out.println();
        // генератор массива
        Random item = new Random();

        int[] arr = new int[item.nextInt(20, 30)];
        System.out.println("arr = ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = item.nextInt(2, 5);
        }
        System.out.println(Arrays.toString(arr));

        // другое решение

        for (int i = 0; i < arr.length; i++) {
            for (int g = 0; g < arr.length - i - 1; g++) {
                if (arr[g] == val) {
                    arr[g] = arr[g + 1];
                    arr[g + 1] = val;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println();

        // решение преподавателя
        int[] myArr = new int[]{1, 3, 3, 2, 4, 3, 5, 3, 3};
        System.out.println(Arrays.toString(myArr));
        int myVal = 3;
        int myCount = 0;

        for (int i = 0; i < myArr.length; i++) {
            if (myArr[i] != myVal) {
                myArr[myCount++] = myArr[i];
            }
        }
        while (myCount < myArr.length) {
            myArr[myCount++] = myVal;
        }
        System.out.println(Arrays.toString(myArr));
    }
}


