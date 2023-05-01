package Lesson3;
import java.util.ArrayList;
import java.util.List;

// Коллекции. Row Type
public class myEx4 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(2809);
        list.add("string line");
        for (Object o : list) {
            System.out.println(o);
            // Проблема извлечения данных
        }
    }
} // row type java
