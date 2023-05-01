package Lesson3;


import java.util.ArrayList;
import java.util.List;

// Коллекции. Save Type
public class myEx5 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(123);
        // list.add("string line");
        for (Object o : list) {
            System.out.println(o);
            // Проблема извлечения данных
        }
    }


}
