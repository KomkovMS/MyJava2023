package Seminar5;

import java.util.HashMap;

/*
Создать структуру для хранения номеров паспортов и фамилий сотрудников
организации
123456 Иванов
321456 Васильев
234561 Петрова
234432 Иванов
654321 Петрова
345678 Иванов
Вывести данные по сотрудникам с фамилией Иванов
 */
public class Sem5Task1 {
    public static void main(String[] args) {
        HashMap<Integer, String> Workers = new HashMap<>();
        Workers.put(123456, "Иванов");
        Workers.put(321456, "Васильев");
        Workers.put(234561, "Петрова");
        Workers.put(234432, "Иванов");
        Workers.put(654321, "Петрова");
        Workers.put(345678, "Иванов");

        for (var item : Workers.entrySet()) {
            // мое решение:
            if (item.getValue() == "Иванов") {
                System.out.printf("[%d: %s]\n", item.getKey(), item.getValue());
                //[123456: Иванов]
                //[234432: Иванов]
                //[345678: Иванов]
            }
            // Или (решение на семинаре):
            if (item.getValue().equals(("Иванов"))) {
                System.out.println(item);
                //123456=Иванов
                //234432=Иванов
                //345678=Иванов
            }
        }
    }
}
