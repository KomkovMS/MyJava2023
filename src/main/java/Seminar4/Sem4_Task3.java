package Seminar4;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

/*
Реализовать консольное приложение, которое:

1. Принимает от пользователя и “запоминает” строки.
2. Если введено print, выводит строки так, чтобы последняя введенная была первой
в списке, а первая - последней.

asd
qwe
zxc
print
zxc
qwe
asd
 */
public class Sem4_Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deque<String> list = new LinkedList<>();

        boolean stop = false;
        String line = "";
        while (!stop) {
            line = sc.nextLine();
            if (line.equals("stop")) {
                stop = true;
            } else {
                if (line.equals("print")) {
                    while (list.size() > 0) {
                        System.out.println(list.pop());
                    }
                } else {
                    list.push(line);
                }
            }

        }
        sc.close();
    }
}

