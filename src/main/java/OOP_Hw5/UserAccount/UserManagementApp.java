package OOP_Hw5.UserAccount;

import java.util.Scanner;

/**
 * Главный класс приложения, являющийся точкой входа.
 */
public class UserManagementApp {
    private User model;
    private UserView view;
    private UserPresenter presenter;

    /**
     * Конструктор класса UserManagementApp.
     * Создает экземпляры модели, представления и презентера.
     */
    public UserManagementApp() {
        // Передайте значения по умолчанию для имени, логина и пароля
        this.model = new User("", "", "");
        this.view = new UserView();
        this.presenter = new UserPresenter(model, view);
    }

    /**
     * Метод для запуска приложения и взаимодействия с пользователем.
     */
    public void run() {
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("=== Меню ===");
            System.out.println("1. Регистрация");
            System.out.println("2. Вход");
            System.out.println("3. Изменить пароль");
            System.out.println("0. Выход");
            System.out.print("Выберите операцию: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Очистка буфера после ввода числа

            switch (choice) {
                case 1:
                    presenter.registerUser();
                    break;
                case 2:
                    presenter.loginUser();
                    break;
                case 3:
                    presenter.changePassword();
                    break;
                case 0:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");
            }
        }

        scanner.close();
    }

    /**
     * Метод, являющийся точкой входа в приложение.
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        UserManagementApp app = new UserManagementApp();
        app.run();
    }
}
