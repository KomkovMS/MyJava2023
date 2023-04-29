package Seminar2;

/*
Напишите метод, который принимает на вход строку (String) и
определяет является ли строка палиндромом (возвращает boolean значение).
 */
public class Sem2_Task3 {
    // мое решение
    static Boolean getRes(StringBuilder sb) {
        for (int i = 0, j = 1; i < sb.length(); i++, j++) {
            if (sb.charAt(i) != sb.charAt(sb.length() - j)) {
                return false;
            }
        }
        return true;
    }

    // другое решение
    /*
    Метод equalsIgnoreCase() – сравнивает данную строку с другой строкой,
    игнорируя регистр. Две строки считаются равными, если они имеют одинаковую
    длину и соответствующие символы у двух строк равны, игнорируя регистр букв.
     */
    static boolean isPalindrom(String str) {
        String temp = new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(temp);
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("gkomokg");
        Boolean answer = getRes(sb);
        System.out.println(answer);
        System.out.println(isPalindrom("komokg"));
    }

}
