package OOP_Hw2.Task1;

/*
ДЗ 2 ЗАДАНИЕ 1
1)Добавить пять интерфейсов к классам из ДЗ 1, включающих все концепции,
упомянутые на семинаре. Вы можете выбрать любой класс из ДЗ 1 и добавить к нему
интерфейсы. Вам также предоставляется возможность добавить новые методы или
использовать уже существующие методы в классе.

 */

public class Main {

    public static void main(String[] args) {
        // Создание экземпляра библиотеки
        Library library = new Library();

        // Добавление книг в каталог
        Book book1 = new Book("Герой нашего времени",
                "Михаил Лермонтов");
        library.addBook(book1);

        Book book2 = new Book("Война и мир", "Лев Толстой");
        library.addBook(book2);

        Book book3 = new Book("Отцы и дети", "Иван Тургенев");
        library.addBook(book3);

        // Отображение доступных книг в библиотеке
        System.out.println("Список доступных книг:");
        library.displayAvailableBooks();

        // Поиск книг по автору
        String searchAuthor = "Михаил Лермонтов";
        System.out.println("Поиск книг автора " + searchAuthor + ":");
        library.searchByAuthor(searchAuthor);

        library.addBook(book1); // Добавление книги

        library.displayAvailableBooks(); // Отображение доступных книг

        library.searchByAuthor("Михаил Лермонтов"); // Поиск книги по автору

        library.display(); // Вызов методов из интерфейсов
        library.search("keyword");
        library.searchByTitle("Отцы и дети");
        library.remove(0);
        library.read();
        library.borrow();
        library.returnBook();
    }
}
