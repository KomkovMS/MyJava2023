package Hw6;

import java.util.HashSet;
import java.util.Set;

/**
 * для фильтрации ноутбуков.
 */
public class FilterUtils {
    /**
     * Фильтрует ноутбуки по минимальному объему оперативной памяти.
     *
     * @param notebooks набор ноутбуков для фильтрации
     * @param minRAM    минимальный объем оперативной памяти (в гигабайтах)
     * @return отфильтрованный набор ноутбуков
     */
    public static Set<NoteBook> filterByRAM(Set<NoteBook> notebooks,
                                            int minRAM) {
        Set<NoteBook> filteredNotebooks = new HashSet<>();
        for (NoteBook notebook : notebooks) {
            if (notebook.getRam() >= minRAM) {
                filteredNotebooks.add(notebook);
            }
        }
        return filteredNotebooks;
    }

    /**
     * Фильтрует ноутбуки по минимальному объему жесткого диска.
     *
     * @param notebooks набор ноутбуков для фильтрации
     * @param minHDD    минимальный объем жесткого диска (в гигабайтах)
     * @return отфильтрованный набор ноутбуков
     */
    public static Set<NoteBook> filterByHDD(Set<NoteBook> notebooks,
                                            int minHDD) {
        Set<NoteBook> filteredNotebooks = new HashSet<>();
        for (NoteBook notebook : notebooks) {
            if (notebook.getHdd() >= minHDD) {
                filteredNotebooks.add(notebook);
            }
        }
        return filteredNotebooks;
    }

    /**
     * Фильтрует ноутбуки по операционной системе.
     *
     * @param notebooks       набор ноутбуков для фильтрации
     * @param operatingSystem операционная система для сравнения
     * @return отфильтрованный набор ноутбуков
     */
    public static Set<NoteBook>
    filterByOperatingSystem(Set<NoteBook> notebooks, String operatingSystem) {
        Set<NoteBook> filteredNotebooks = new HashSet<>();
        for (NoteBook notebook : notebooks) {
            if
            (notebook.getOperatingSystem().equalsIgnoreCase(operatingSystem)) {
                filteredNotebooks.add(notebook);
            }
        }
        return filteredNotebooks;
    }

    /**
     * Фильтрует ноутбуки по цвету.
     *
     * @param notebooks набор ноутбуков для фильтрации
     * @param color     цвет для сравнения
     * @return отфильтрованный набор ноутбуков
     */
    public static Set<NoteBook> filterByColor(Set<NoteBook> notebooks,
                                              String color) {
        Set<NoteBook> filteredNotebooks = new HashSet<>();
        for (NoteBook notebook : notebooks) {
            if (notebook.getColor().equalsIgnoreCase(color)) {
                filteredNotebooks.add(notebook);
            }
        }
        return filteredNotebooks;
    }
}
