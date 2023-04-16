package Seminar1;

/*
Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное
количество подряд идущих 1.
 */
public class Task2 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1, 1, 1};
        int maxCount = 0;
        int count = 0;

        for (int num : nums) {
            if (num == 1) {
                count++;
            } else {
                maxCount = Math.max(maxCount, count);
                count = 0;
            }
        }
        maxCount = Math.max(maxCount, count);
        System.out.println(maxCount);

        // вариант решения на семинаре
        int[] arr = new int[]{1, 1, 0, 1, 1, 1};
        int curr_count = 0;
        int max_count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                curr_count++;
            } else {
                if (max_count < curr_count) {
                    max_count = curr_count;
                }
                curr_count = 0;
            }
        }
        if (max_count < curr_count) {
            max_count = curr_count;
        }
        System.out.println(max_count);
    }
}

