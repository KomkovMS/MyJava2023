package OOP_Sem3.Task_1;

public class main {
    public static void main(String[] args) {
        I_MyNum myNum_1;//создать ссылку на экземпляр
        myNum_1 = (y) -> 98.6/y;//реализация
        System.out.println(myNum_1.getNum(12.4));
        System.out.println(myNum_1.getNum(7.951612903225806));
    }
}
