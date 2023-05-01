package Lesson3;
import java.util.ArrayList;
public class Ex002 {

   public static void main(String[] args) {
       ArrayList<Integer> list = new ArrayList<Integer>(); // или:
       // ArrayList list = new ArrayList();
       list.add(2809);

       System.out.println(list); //[2809]
       for (Object o : list) {
           System.out.println(o); //2809
       }
   }
}
