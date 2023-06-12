package OOP_Sem5.UserAccount;

/**
 * Класс, который служит посредником между моделью и представлением.
 */
public class UserPresenter {
    private User model;
    private UserView view;

    /**
     * Конструктор класса UserPresenter.
     *
     * @param model экземпляр класса User (модель)
     * @param view  экземпляр класса UserView (представление)
     */
    public UserPresenter(User model, UserView view) {
        this.model = model;
        this.view = view;
    }

    /**
     * Метод для регистрации пользователя.
     */
    public void registerUser() {
        view.displayRegistrationForm();
        String name = view.getUserInput();
        String username = view.getUserInput();
        String password = view.getUserInput();

        model.setName(name);
        model.setUsername(username);
        model.setPassword(password);
        model.save();

        System.out.println("Пользователь зарегистрирован.");
    }

    /**
     * Метод для входа пользователя.
     */
    public void loginUser() {
        view.displayLoginForm();
        String username = view.getUserInput();
        String password = view.getUserInput();

        if (username.equals(model.getUsername()) && password.equals(model.
                getPassword())) {
            System.out.println("Вход выполнен.");
        } else {
            System.out.println("Неверные логин или пароль.");
        }
    }

    /**
     * Метод для изменения пароля пользователя.
     */
    public void changePassword() {
        view.displayChangePasswordForm();
        String oldPassword = view.getUserInput();
        String newPassword = view.getUserInput();

        if (oldPassword.equals(model.getPassword())) {
            model.setPassword(newPassword);
            model.save();
            System.out.println("Пароль успешно изменен.");
        } else {
            System.out.println("Неверный старый пароль.");
        }
    }
}
