package OOP_Hw6.Task2;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ArrayReader {
    public static String[] readArrayFromFile(String filePath) throws
            FileNotFoundException {
        File file = new File(filePath);
        Scanner scanner = new Scanner(file);

        // Чтение массива из файла
        // ...

        String[] array = new String[0];
        return array;
    }
}
