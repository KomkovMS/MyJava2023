package OOP_Sem5.UserAccount;

import java.util.Scanner;

/**
 * Класс, отвечающий за отображение информации о пользователе и взаимодействие
 * с пользователем.
 */
public class UserView {
    private Scanner scanner;

    /**
     * Конструктор класса UserView.
     * Инициализирует сканнер для чтения ввода пользователя.
     */
    public UserView() {
        scanner = new Scanner(System.in);
    }

    /**
     * Метод для отображения формы регистрации.
     */
    public void displayRegistrationForm() {
        System.out.println("=== Регистрация ===");
        System.out.print("Введите имя: ");
        String name = scanner.nextLine();
        System.out.print("Введите логин: ");
        String username = scanner.nextLine();
        System.out.print("Введите пароль: ");
        String password = scanner.nextLine();
        System.out.println("Регистрация успешно завершена.");
    }

    /**
     * Метод для отображения формы входа.
     */
    public void displayLoginForm() {
        System.out.println("=== Вход ===");
        System.out.print("Введите логин: ");
        String username = scanner.nextLine();
        System.out.print("Введите пароль: ");
        String password = scanner.nextLine();
        System.out.println("Вход выполнен.");
    }

    /**
     * Метод для отображения формы изменения пароля.
     */
    public void displayChangePasswordForm() {
        System.out.println("=== Изменение пароля ===");
        System.out.print("Введите старый пароль: ");
        String oldPassword = scanner.nextLine();
        System.out.print("Введите новый пароль: ");
        String newPassword = scanner.nextLine();
        System.out.println("Пароль успешно изменен.");
    }

    /**
     * Метод для получения введенных пользователем данных.
     *
     * @return введенные пользователем данные
     */
    public String getUserInput() {
        return scanner.nextLine();
    }
}
