package Seminar4;

import java.util.ArrayList;
import java.util.LinkedList;

/*
1) Замерьте время, за которое в ArrayList добавятся 100000 элементов.
2) Замерьте время, за которое в LinkedList добавятся 100000 элементов.
Сравните с предыдущим.
 */
public class Sem4_Task1 {
    public static void main(String[] args) {
        long StartTime1 = System.currentTimeMillis();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Integer arrSize = 100_000;

        for (int i = 0; i < arrSize; i++) {
            // arr.add(i); - добавление в начало
            arr.add(0, i);
        }

        long EndTime1 = System.currentTimeMillis() - StartTime1;
        System.out.println("Время, за которое в ArrayList добавятся " + arrSize
                + " элементов: " + EndTime1 + " милисекунд.");

        long StartTime2 = System.currentTimeMillis();
        LinkedList<Integer> arr2 = new LinkedList<Integer>();

        for (int i = 0; i < arrSize; i++) {
            arr.add(i); // добавление в начало
            // arr.add(0, i);
        }

        long EndTime2 = System.currentTimeMillis() - StartTime2;
        System.out.println("Время, за которое в LinkedList добавятся " + arrSize
                + " элементов: " + EndTime2 + " милисекунд.");

    }
}
