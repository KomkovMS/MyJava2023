package Seminar2;

import java.io.File;
import java.io.FileWriter;

/*
Задание - записать слово TEST в файл 10 раз
 */
public class Sem2_Task4 {
    public static void main(String[] args) {
        Integer n = 10;
        String text = "TEST";
        String file_name = "1.txt";


        File file = new File(file_name);


        try{
            FileWriter writer = new FileWriter(file,false);
            for (int i = 0; i < n; i++){
                writer.write(text);
                writer.write("\n");
            }
            writer.close();
            System.out.println("Получилось!)");
        }
        catch (Exception e){
            System.out.println("Что то пошло не так");
        }
    }
}
