package Seminar1gb;

import java.util.Random;

/*
Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
 */
public class Hw1 {
    public static void main(String[] args) {
        Random r = new Random();
        int i = r.nextInt(0, 2000);
        System.out.println(i);

    }
}

