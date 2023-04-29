
// Создать строку из 1 млн плюсиков.
package Lesson2;
public class Les1_ex {
    public static void main(String[] args) {
//        String str = "";
//        for (int i = 0; i < 1_000_000; i++) {
//            str += "+";
//        }
//        System.out.println(str);

//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < 1_000_000; i++) {
//            sb.append("+");
//        }
//        System.out.println(sb);

        var s = System.currentTimeMillis();
        //String str = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1_000_000; i++) {
            //str += "+";
            sb.append("+");
        }
        System.out.println(System.currentTimeMillis() - s);
        //System.out.println(str);
        //System.out.println(sb);
    }
}
