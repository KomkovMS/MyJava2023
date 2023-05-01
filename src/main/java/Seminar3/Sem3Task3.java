package Seminar3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/*
Создать ArrayList. Поместить в него как строки, так и целые числа.
Пройти по списку, найти и удалить целые числа.
 */
public class Sem3Task3 {
    public static void main(String[] args) {
        ArrayList<Object> arr = new ArrayList<>(Arrays.asList(0, "aa", 1, "bb",
                2, "cc", 3));

        for (int i = arr.size() - 1; i >= 0; i--) {
            if (arr.get(i) instanceof Integer) {
                arr.remove(i);
            }
        }
        System.out.println(arr); // [aa, bb, cc]
    }
}
