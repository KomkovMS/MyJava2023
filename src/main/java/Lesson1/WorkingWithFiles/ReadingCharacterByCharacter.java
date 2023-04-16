package Lesson1.WorkingWithFiles;
//Работа с файлами
//Чтение, Вариант посимвольно

import java.io.*;

public class ReadingCharacterByCharacter {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("file.txt");
        int c;
        while ((c = fr.read()) != -1) {
            char ch = (char) c;
            if (ch == '\n') {
                System.out.print(ch);
            } else {
                System.out.print(ch);
            }
        }

    }

}
