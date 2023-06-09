package OOP_Hw1.OOP_Hw1_Task3;

/*
Задача 3:
Реализуйте систему управления библиотекой.
Создайте классы "Книга" (Book) и "Библиотека" (Library) со следующими
свойствами и методами:

Класс "Книга" (Book):

Приватные поля "название" (title) и "автор" (author) типа String для хранения
названия и автора книги соответственно.
Приватное поле "доступность" (available) типа boolean для указания доступности
книги.
Публичные методы доступа (геттеры и сеттеры) для полей "название" и "автор".
Публичные методы доступа (геттеры и сеттеры) для поля "доступность".
Публичный метод "показать информацию" (displayInfo), который выводит на консоль
информацию о книге (название, автор, доступность).

Класс "Библиотека" (Library):

Приватное поле "каталог" (catalog) типа ArrayList<Book> для хранения списка книг
в библиотеке.
Публичный метод "добавить книгу" (addBook), который принимает объект типа Book и
добавляет его в каталог библиотеки.
Публичный метод "удалить книгу" (removeBook), который принимает объект типа Book
и удаляет его из каталога библиотеки.
Публичный метод "показать доступные книги" (displayAvailableBooks), который
выводит на консоль информацию о доступных книгах в библиотеке.
Публичный метод "поиск книги по автору" (searchByAuthor), который принимает имя
автора в качестве параметра и выводит на консоль информацию о книгах данного
автора, находящихся в каталоге библиотеки.
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
    }
}
