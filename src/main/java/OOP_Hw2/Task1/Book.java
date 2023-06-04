package OOP_Hw2.Task1;

// Task1
/**
 * Класс, представляющий книгу.
 */
class Book {
    private String title; // Название книги
    private String author; // Автор книги
    private boolean available; // Доступность книги

    /**
     * Конструктор класса Book.
     *
     * @param title  название книги
     * @param author автор книги
     */
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.available = true; // Книга доступна по умолчанию
    }

    /**
     * Метод для получения названия книги.
     *
     * @return название книги
     */
    public String getTitle() {
        return title;
    }

    /**
     * Метод для получения имени автора книги.
     *
     * @return автор книги
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Метод для проверки доступности книги.
     *
     * @return true, если книга доступна, иначе false
     */
    public boolean isAvailable() {
        return available;
    }

    /**
     * Метод для установки доступности книги.
     *
     * @param available доступность книги
     */
    public void setAvailable(boolean available) {
        this.available = available;
    }

    /**
     * Метод для отображения информации о книге.
     */
    public void displayInfo() {
        System.out.println("Название: " + title);
        System.out.println("Автор: " + author);
        if (available) {
            System.out.println("Доступность: Да");
        } else {
            System.out.println("Доступность: Нет");
        }
    }
}
