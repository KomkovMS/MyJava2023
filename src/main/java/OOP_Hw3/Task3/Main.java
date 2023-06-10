package OOP_Hw3.Task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


/*

 */
public class Main {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(7);
        numbers.add(1);

        Comparator<Integer> ascendingComparator = Integer::compareTo;
        ObjectSorter.sort(numbers, ascendingComparator);
        System.out.println("По возрастанию: " + numbers);

        Comparator<Integer> descendingComparator = Collections.reverseOrder();
        ObjectSorter.sort(numbers, descendingComparator);
        System.out.println("По убыванию: " + numbers);
    }
}
