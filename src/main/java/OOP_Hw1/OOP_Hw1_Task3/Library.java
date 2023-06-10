package OOP_Hw1.OOP_Hw1_Task3;

import java.util.ArrayList;

/**
 * Класс, представляющий библиотеку.
 */
class Library {
    private ArrayList<Book> catalog; // Каталог книг

    /**
     * Конструктор класса Library.
     */
    public Library() {
        catalog = new ArrayList<>();
    }

    /**
     * Метод для добавления книги в каталог библиотеки.
     *
     * @param book объект типа Book для добавления
     */
    public void addBook(Book book) {
        catalog.add(book);
    }

    /**
     * Метод для удаления книги из каталога библиотеки.
     *
     * @param book объект типа Book для удаления
     */
    public void removeBook(Book book) {
        catalog.remove(book);
    }

    /**
     * Метод для отображения информации о доступных книгах в библиотеке.
     */
    public void displayAvailableBooks() {
        System.out.println("Доступные книги:");
        for (Book book : catalog) {
            if (book.isAvailable()) {
                book.displayInfo();
                System.out.println();
            }
        }
    }

    /** Метод для поиска книги по имени автора.
     *
     * @param author имя автора
     */
    public void searchByAuthor(String author) {
        System.out.println("Книги автора " + author + ":");
        for (Book book : catalog) {
            if (book.getAuthor().equals(author)) {
                book.displayInfo();
                System.out.println();
            }
        }
    }
}
