package Seminar3;

import java.util.*;

/*
Заполнить список названиями планет Солнечной системы в произвольном порядке с
повторениями.
Вывести название каждой планеты и количество его повторений в списке.

земля, юпитер, Сатурн, земля, марс, земля, юпитер
земля 3
юпитер 2
Сатурн 1
марс 1
 */
public class Sem3Task2 {
    public static void main(String[] args) {
        System.out.println("\033[H\033[2J"); // очищать консоль
        final int n = 10;
        String[] planets = {"Меркурий", "Венера", "Земля", "Марс", "Юпитер",
                "Сатурн", "Уран", "Нептун"};
        Random rnd = new Random();
        ArrayList<String> plntList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            plntList.add(planets[rnd.nextInt(planets.length)]);
        }
        System.out.println(plntList);

        System.out.println("*****************************");
// long time = System.nanoTime();
        int count = 0;
        for (String elem : planets) {
            for (String elem2 : plntList) {
                if (elem.equals(elem2)) count++;
            }
            if (count != 0)
                System.out.printf("%s: %d \n", elem, count);
            count = 0;
        }

        System.out.println("*****************************");
        int count1 = 1;
        plntList.sort(null);
        for (int i = 1; i < plntList.size(); i++) {
            if (plntList.get(i).equals(plntList.get(i - 1))) {
                count1++;
            } else {
                System.out.printf("%s: %d \n", plntList.get(i), count1);
                count1 = 1;
            }
        }
        System.out.printf("%s: %d \n", plntList.get(plntList.size() - 1), count1);

    }
}

