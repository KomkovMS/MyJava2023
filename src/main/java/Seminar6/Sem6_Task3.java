package Seminar6;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/*
Продумайте структуру класса Кот. Какие поля и методы будут актуальны для
приложения, которое является информационной системой ветеринарной клиники.

Пример,
Поля:
integer age - возраст
string name - имя
boolean

Методы:
miay - кот "name" мяукнул 5 раз
 */
public class Sem6_Task3 {
    Integer birthYear;
    String name;
    boolean gender;
    String vendorPhone;

    HashMap<String, String> visit = new HashMap<>(); // журнал посещений

    public void visit(String visitDate, String visitResult) {
        this.visit.put(visitDate, visitResult);
    }

    public void miay() {
        System.out.printf("кот %s мяукнул 5 раз\n", this.name);
    }

    public int age() {
        LocalDate today = LocalDate.now();
        return today.getYear() - this.birthYear;
    }

    public void printVisits() {
        System.out.println(this.visit);
    }
}
