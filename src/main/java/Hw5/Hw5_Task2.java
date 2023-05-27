package Hw5;

import java.util.*;

/*
Пусть дан список сотрудников:
Иван Иванов
Светлана Петрова
Кристина Белова
Анна Мусина
Анна Крутова
Иван Юрин
Петр Лыков
Павел Чернов
Петр Чернышов
Мария Федорова
Марина Светлова
Мария Савина
Мария Рыкова
Марина Лугова
Анна Владимирова
Иван Мечников
Петр Петин
Иван Ежов

Написать программу, которая найдет и выведет повторяющиеся имена с количеством
повторений.
Отсортировать по убыванию популярности Имени.
 */
public class Hw5_Task2 {
    public static void main(String[] args) {
        List<String> employees = Arrays.asList(
                "Иван Иванов",
                "Светлана Петрова",
                "Кристина Белова",
                "Анна Мусина",
                "Анна Крутова",
                "Иван Юрин",
                "Петр Лыков",
                "Павел Чернов",
                "Петр Чернышов",
                "Мария Федорова",
                "Марина Светлова",
                "Мария Савина",
                "Мария Рыкова",
                "Марина Лугова",
                "Анна Владимирова",
                "Иван Мечников",
                "Петр Петин",
                "Иван Ежов"
        );

        Map<String, Integer> nameCountMap = new HashMap<>();

        // Подсчет количества повторений каждого имени
        for (String employee : employees) {
            String name = employee.split(" ")[0];
            nameCountMap.put(name, nameCountMap.getOrDefault(name, 0)
                    + 1);
        }

        // Сортировка результатов по убыванию количества повторений
        List<Map.Entry<String, Integer>> sortedEntries = new ArrayList<>
                (nameCountMap.entrySet());
        sortedEntries.sort(Map.Entry.comparingByValue(Comparator.
                reverseOrder()));

        // Вывод результатов
        for (Map.Entry<String, Integer> entry : sortedEntries) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
