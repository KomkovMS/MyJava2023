package Lesson1;

public class LessonOne {
    public static void main(String[] args) {    // main
        System.out.println("bye world"); // sout
        System.out.println("Hello");

        short age = 10;
        int salary = 123456;
        System.out.println(age); //10
        System.out.println(salary); //123456

        String s = null;
        System.out.println(s); // null

        float e = 2.7f;
        double pi = 3.1415;
        System.out.println(e); // 2.7
        System.out.println(pi); // 3.1415

        char ch = '1';
        System.out.println(Character.isDigit(ch)); // true
        ch = 'a';
        System.out.println(Character.isDigit(ch)); // false
        ch = 123;
        System.out.println(ch); // {

        boolean flag1 = 123 <= 234;
        System.out.println(flag1); // true
        boolean flag2 = 123 >= 234 || flag1;
        System.out.println(flag2); // true
        boolean flag3 = flag1 ^ flag2; // разделительная дизъянкция
        System.out.println(flag3); // false

        var a = 123;
        System.out.println(a); // 123
        var d = 123.456;
        System.out.println(d); // 123.456

        var i = 123;


        a = 123;
        System.out.println(a); // 123
        d = 123.456;
        System.out.println(d); // 123.456
        System.out.println(getType(a)); // Integer
        System.out.println(getType(d)); // Double
        d = 1022;
        System.out.println(d); // 1022
        //d = "mistake";
        //error: incompatible types:
        //String cannot be converted to double

        int r = 123;
        System.out.println(Integer.max(r, 4)); // 123

        String j = "qwe";

        System.out.println(j.charAt(1));    //w

        int z = 123;
        z++;
        System.out.println(z);  // 124

        System.out.println(z++);    // 124
        System.out.println(z);  // 125
        System.out.println(++z);    // 126

        z = z-- - --z;
        System.out.println(z);

        int aa = 5; // 101
        int bb = 2; // 010
        System.out.println(aa | bb); // 111    //7

        String sss = "qww1"; // 4, 0..3
        // boolean bbb = sss.length() >= 5 && sss.charAt(4) == '1'; //true
        //        boolean bbb = sss.length() >= 5 & sss.charAt(4) == '1'; // Exception in thread "main" java.lang.StringIndexOutOfBoundsException: Index 4 out of bounds for length 4
        //        System.out.println(bbb);

    }

    static String getType(Object o) {
        return o.getClass().getSimpleName();
    }


}
