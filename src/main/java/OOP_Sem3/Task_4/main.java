package OOP_Sem3.Task_4;

// Функциональные интерфейсы

public class main {
    public static void main(String[] args) {
        Predicate_1<Integer> isNum = (x) -> (x > 0);


        System.out.println(isNum.test(12));
        System.out.println(isNum.test(-3));

        Predicate_1<Double> isNum_1 = (x) -> (x > 0);


        System.out.println(isNum_1.test(12.63));
        System.out.println(isNum_1.test(-8.6));
    }
}
