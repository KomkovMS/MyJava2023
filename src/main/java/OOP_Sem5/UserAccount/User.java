package OOP_Sem5.UserAccount;

import java.io.Serializable;

/**
 * Класс, представляющий учетную запись пользователя.
 */
public class User implements Serializable {
    private String name;
    private String username;
    private String password;

    /**
     * Конструктор класса User.
     *
     * @param name     имя пользователя
     * @param username логин пользователя
     * @param password пароль пользователя
     */
    public User(String name, String username, String password) {
        this.name = name;
        this.username = username;
        this.password = password;
    }

    /**
     * Метод для сохранения данных пользователя.
     */
    public void save() {
        try {
            // Код сохранения данных пользователя
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Метод для загрузки данных пользователя.
     * Например, может использоваться десериализация объекта из файла.
     */
    public void load() {
        try {
            // Код загрузки данных пользователя
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Метод для получения имени пользователя.
     *
     * @return имя пользователя
     */
    public String getName() {
        return name;
    }

    /**
     * Метод для установки имени пользователя.
     *
     * @param name имя пользователя
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Метод для получения логина пользователя.
     *
     * @return логин пользователя
     */
    public String getUsername() {
        return username;
    }

    /**
     * Метод для установки логина пользователя.
     *
     * @param username логин пользователя
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Метод для получения пароля пользователя.
     *
     * @return пароль пользователя
     */
    public String getPassword() {
        return password;
    }

    /**
     * Метод для установки пароля пользователя.
     *
     * @param password пароль пользователя
     */
    public void setPassword(String password) {
        this.password = password;
    }
}
