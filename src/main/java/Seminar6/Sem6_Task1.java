package Seminar6;

import java.util.*;

/*
1. Создайте HashSet, заполните его следующими числами:
{1, 2, 30_000, 2, 4, 5_000, 6, 7654, 1234, 8673, 34, 5654}
 */
public class Sem6_Task1 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<Integer>(Arrays.asList
                (1, 2, 30_000, 2, 4, 5_000, 6, 7654, 1234, 8673, 34, 5654));
//        set.add(1); set.add(2); set.add(30_000); set.add(2); set.add(4);
//        set.add(5_000); set.add(6); set.add(7654); set.add(1234); set.add(8673);
//        set.add(34); set.add(5654);
        System.out.println(set);

        LinkedHashSet<Integer> set2 = new LinkedHashSet<Integer>(Arrays.asList
                (1, 2, 30_000, 2, 4, 5_000, 6, 7654, 1234, 8673, 34, 5654));
        System.out.println(set2);

        TreeSet<Integer> set3 = new TreeSet<>(Arrays.asList
                (1, 2, 30_000, 2, 4, 5_000, 6, 7654, 1234, 8673, 34, 5654));
        System.out.println(set3);
    }
}
