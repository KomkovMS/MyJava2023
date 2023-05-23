package Seminar5;

import java.util.HashMap;
import java.util.Map;

/*
Даны 2 строки, написать метод, который вернет true, если эти строки являются
изоморфными и false, если нет. Строки изоморфны, если одну букву в первом слове
можно заменить на некоторую вторую букву во втором слове, при этом повторяющиеся
буквы одного слова меняют на одну и ту же букву с сохранением порядка
следования. Например, add - egg изоморфны.

Пример 1:
Input: s = "foo", t = "bar";
Output: false;

f -> b
o -> a
o != r

Пример 2:
Input: s = "paper", t = "title";
Output: true.

p -> t
a -> i
e -> l
r -> e

 */
public class Sem5Task2 {

    static boolean izomorf(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        Map<Character, Character> db = new HashMap<>();
        for (int i = 0; i < a.length(); i++) {
            if (db.containsKey(a.charAt(i))) {
                if (b.charAt(i) != db.get(a.charAt(i))) {
                    return false;
                }
            } else db.put(a.charAt(i), b.charAt(i));
        }
        return true;
    }

    public static void main(String[] args) {
        String word1 = "paper";
        String word2 = "title";
        String word3 = "ttttt";
        System.out.println(izomorf(word1, word2) && izomorf(word2, word1)); // true
        System.out.println(izomorf(word1, word3) && izomorf(word3, word1)); // false

    }
}

