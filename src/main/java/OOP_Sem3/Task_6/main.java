package OOP_Sem3.Task_6;

import java.util.function.UnaryOperator;

public class main {
    public static void main(String[] args) {
        UnaryOperator<Integer> numTest_1 = x -> x * x;


        System.out.println(numTest_1.apply(5));
    }
}
