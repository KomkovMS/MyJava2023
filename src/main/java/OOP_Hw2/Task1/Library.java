package OOP_Hw2.Task1;

// Task1

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Класс, представляющий библиотеку.
 */
class Library implements I_Displayable, I_Searchable, I_Manageable, I_Readable,
        I_Borrowable {
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

    public void add() {
        // Реализация метода add()
        // ...
    }

    /**
     * Метод для выдачи книги.
     * Пользователь будет запрошен ввести номер книги для выдачи.
     * Если книга с указанным номером существует в каталоге и доступна,
     * она будет помечена как недоступная, и на экран будет выведено сообщение
     * об успешной выдаче.
     * Если книга недоступна или указан некорректный номер книги,
     * будет выведено соответствующее сообщение.
     */
    @Override
    public void borrow() {
        System.out.println("Выдача книги...");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер книги для выдачи: ");
        int bookNumber = scanner.nextInt();

        if (bookNumber >= 0 && bookNumber < catalog.size()) {
            Book bookToBorrow = catalog.get(bookNumber);
            if (bookToBorrow.isAvailable()) {
                bookToBorrow.setAvailable(false);
                System.out.println("Книга " + bookToBorrow.getTitle() +
                        " успешно выдана.");
            } else {
                System.out.println("Книга " + bookToBorrow.getTitle() +
                        " недоступна для выдачи.");
            }
        } else {
            System.out.println("Некорректный номер книги.");
        }
    }

    /**
     * Метод для возврата книги.
     * Пользователь будет запрошен ввести номер книги для возврата.
     * Если книга с указанным номером существует в каталоге и не доступна,
     * она будет помечена как доступная, и на экран будет выведено сообщение о
     * успешном возврате.
     * Если книга уже доступна или указан некорректный номер книги,
     * будет выведено соответствующее сообщение.
     */
    @Override
    public void returnBook() {
        System.out.println("Возврат книги...");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер книги для возврата: ");
        int bookNumber = scanner.nextInt();

        if (bookNumber >= 0 && bookNumber < catalog.size()) {
            Book bookToReturn = catalog.get(bookNumber);
            if (!bookToReturn.isAvailable()) {
                bookToReturn.setAvailable(true);
                System.out.println("Книга " + bookToReturn.getTitle() +
                        " успешно возвращена.");
            } else {
                System.out.println("Книга " + bookToReturn.getTitle() +
                        " уже доступна.");
            }
        } else {
            System.out.println("Некорректный номер книги.");
        }
    }

    /**
     * Метод для отображения списка книг в библиотеке.
     * Выводит на экран информацию о каждой книге в каталоге.
     */
    @Override
    public void display() {
        System.out.println("Список книг в библиотеке:");
        for (Book book : catalog) {
            book.displayInfo();
            System.out.println();
        }
    }

    /**
     * Выполняет поиск книг по указанному заголовку в каталоге библиотеки.
     * Отображает информацию о книгах, у которых совпадает указанный заголовок.
     *
     * @param title заголовок для поиска
     */
    @Override
    public void searchByTitle(String title) {
        System.out.println("Поиск по заголовку: " + title);
        boolean found = false;

        for (Book book : catalog) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                book.displayInfo();
                found = true;
            }
        }

        if (!found) {
            System.out.println("Книги с заголовком " + title + " не найдены.");
        }
    }

    /**
     * Удаляет книгу из каталога по указанному индексу.
     * Если индекс корректный, книга будет удалена из каталога, и выводится
     * сообщение об успешном удалении.
     * Если индекс некорректный, выводится сообщение о некорректном
     * индексе книги.
     *
     * @param index index индекс книги для удаления (должен быть больше или
     *              равен 0 и меньше размера каталога)
     */
    @Override
    public void remove(int index) {
        if (index >= 0 && index < catalog.size()) {
            Book removedBook = catalog.remove(index);
            System.out.println("Книга " + removedBook.getTitle() + " успешно " +
                    "удалена из каталога.");
        } else {
            System.out.println("Некорректный индекс книги.");
        }
    }

    /**
     * Осуществляет чтение книги.
     * Пользователь вводит номер книги для чтения.
     * Если номер корректный, выводится информация о книге.
     *
     * @throws java.util.InputMismatchException если введено некорректное
     * значение номера книги
     */
    @Override
    public void read() {
        System.out.println("Чтение книги...");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер книги для чтения: ");
        int bookNumber = scanner.nextInt();

        if (bookNumber >= 0 && bookNumber < catalog.size()) {
            Book bookToRead = catalog.get(bookNumber);
            System.out.println("Вы читаете книгу: " + bookToRead.getTitle());
        } else {
            System.out.println("Некорректный номер книги.");
        }
    }

    /**
     * Выполняет поиск книги по ключевому слову в заголовке или авторе.
     * Выводит информацию о книгах, которые содержат указанное ключевое слово.
     *
     * @param keyword ключевое слово для поиска
     */
    @Override
    public void search(String keyword) {
        System.out.println("Результаты поиска по ключевому слову: " + keyword);
        for (Book book : catalog) {
            if (book.getTitle().contains(keyword) || book.getAuthor().
                    contains(keyword)) {
                book.displayInfo();
                System.out.println();
            }
        }
    }
}
