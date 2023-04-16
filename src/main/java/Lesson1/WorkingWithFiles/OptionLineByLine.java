package Lesson1.WorkingWithFiles;
//Работа с файлами
//Вариант построчно

import java.io.*;

public class OptionLineByLine {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("file.txt"));
        String str;
        while ((str = br.readLine()) != null) {
            System.out.printf("== %s ==\n", str);
        }
        br.close();
    }

}
