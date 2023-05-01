package Lesson3;

import java.util.ArrayList;
import java.util.List;

public class Ex006_2 {
    public static void main(String[] args) {
        Character value = null;
        List<Character> list1 = new ArrayList<Character>();
        list1.add('S');
        list1.add('e');
        list1.add('r');
        list1.add('g');
        list1.add('e');
        list1.add('y');
        System.out.println(list1);  //[S, e, r, g, e, y]
        list1.remove(1); // java.lang.UnsupportedOperationException
        List<Character> list2 = List.copyOf(list1);
        System.out.println(list1);  //[S, r, g, e, y]

    }
}
