package Lesson1;

public class VariableScope {
    public static void main(String[] args) {

        // Область видимости переменных
        int b = 1;
        {
            int i = 523;
            System.out.println(i + b); // 524
        }
        int i = 123;
        System.out.println(i + b); // 124
    }

}
