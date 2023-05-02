package Hw4;

import java.util.LinkedList;

/*
Пусть дан LinkedList с несколькими элементами.
Реализуйте метод(не void), который вернет “перевернутый” список
 */
public class Hw4_Task1 {
    public static void main(String[] args) {
        LinkedList<Object> list = new LinkedList<Object>();
        list.add("fsdf");
        list.add(123);
        list.add("jhdfg");
        list.add("&%$");
        list.add(7345);

        LinkedList<Object> reversedList = reverseList(list);

        System.out.println("Первоначальный список: " + list);
        System.out.println("Перевернутый список: " + reversedList);
        System.out.println("--------------------------------------");

        LinkedList<Object> list2 = new LinkedList<Object>();
        list2.add(11);
        list2.add(123);
        list2.add(77);
        list2.add(15);
        list2.add(890);

        LinkedList<Object> reveList = revList(list2);

        System.out.println("Первоначальный список: " + list2);
        System.out.println("Перевернутый список: " + reveList);
    }

// вариант 1 (новый список)

    /**
     * Метод для переворачивания связанного списка.
     *
     * @param list связанный список, который нужно перевернуть.
     * @return новый связанный список, содержащий элементы в обратном порядке.
     */
    public static LinkedList<Object> reverseList(LinkedList<Object> list) {
        LinkedList<Object> reversedList = new LinkedList<Object>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reversedList.add(list.get(i));
        }
        return reversedList;
    }

// вариант 2 (изменяем существующий список)

    /**
     * Метод для переворота связанного списка.
     * Меняет порядок элементов списка на обратный и возвращает измененный список.
     *
     * @param list2 связанный список для переворота
     * @return перевернутый связанный список
     */
    public static LinkedList<Object> revList(LinkedList<Object> list2) {
        int size = list2.size();
        for (int i = 0; i < size / 2; i++) {
            Object temp = list2.get(i);
            list2.set(i, list2.get(size - i - 1));
            list2.set(size - i - 1, temp);
        }
        return list2;
    }
}

