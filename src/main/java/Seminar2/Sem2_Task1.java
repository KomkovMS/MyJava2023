package Seminar2;

/*
Дано четное число N (>0) и символы c1 и c2. Написать метод, который вернет
строку длины N,
которая состоит из чередующихся символов c1 и c2, начиная с c1.
6
a b
ababab
 */
public class Sem2_Task1 {
    // мое решение
    static String myString(String c1, String c2, int n) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n / 2; i++) {
            result.append(c1 + c2);
        }
        return result.toString();
    }

    public static void main(String[] args) throws Exception {

        int n = 6;
        String c1 = "a";
        String c2 = "b";

        String result = myString(c1, c2, n);
        System.out.println(result);
    }
}
