package Hw2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


/*
Дана строка (получение через обычный текстовый файл!!!)

"фамилия":"Иванов","оценка":"5","предмет":"Математика"
"фамилия":"Петрова","оценка":"4","предмет":"Информатика"

Написать метод(ы), который распарсит строку и, используя StringBuilder, создаст
строки вида:
Студент [фамилия] получил [оценка] по предмету [предмет].

Пример вывода в консоль:
Студент Иванов получил 5 по предмету Математика.
Студент Петрова получил 4 по предмету Информатика.
Студент Краснов получил 5 по предмету Физика.
 */
public class Hw2_Task2 {
    public static void main(String[] args) {
        String filePath = "input.txt";

        try (FileReader fr = new FileReader(filePath);
             BufferedReader br = new BufferedReader(fr)) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                String surname = parts[0].split(":")[1].replace("\"", "");
                String mark = parts[1].split(":")[1].replace("\"", "");
                String subject = parts[2].split(":")[1].replace("\"", "");

                StringBuilder sb = new StringBuilder();
                sb.append("Студент ").append(surname).append(" получил ")
                        .append(mark).append(" по предмету ").append(subject).append(".");
                System.out.println(sb.toString());
            }
        } catch (IOException e) {
            System.err.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }
}
