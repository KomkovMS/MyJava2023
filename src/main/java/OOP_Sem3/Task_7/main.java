package OOP_Sem3.Task_7;

import java.util.function.Function;

public class main {
    public static void main(String[] args) {
        Function<Integer, String> test_1 = x -> String.valueOf(x) + " долларов";

        System.out.println(test_1.apply(5));
    }
}
