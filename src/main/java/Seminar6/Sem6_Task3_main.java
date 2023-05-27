package Seminar6;

public class Sem6_Task3_main {
    public static void main(String[] args) {
        Sem6_Task3 cat = new Sem6_Task3();
        cat.name = "Barsik";
        cat.birthYear = 2020;
        cat.gender = true;
        cat.vendorPhone = "+7213512345";

        cat.visit("21/05/2023", "Кот здоров");
        cat.visit("21/04/2023", "Кот совсем плох");

        cat.printVisits();

        cat.miay();
    }
}
