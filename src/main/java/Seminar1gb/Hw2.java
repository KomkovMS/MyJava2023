package Seminar1gb;
import java.util.Random;
/*
Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
 */
public class Hw2 {
    public static void main(String[] args) {
        Random random = new Random();
        int x = random.nextInt(); // Получаем случайное число
        int n = 0;
        while (x != 0) {
            n++;
            x >>>= 1;
        }
        System.out.println("Случайное число: " + x);
        System.out.println("Номер старшего значащего бита: " + n);


    }
}

