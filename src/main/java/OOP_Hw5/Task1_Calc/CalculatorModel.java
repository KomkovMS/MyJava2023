package OOP_Hw5.Task1_Calc;

/**
 * Модель калькулятора, выполняющая арифметические операции над числами.
 */
public class CalculatorModel {
    private Number result;

    /**
     * Конструктор класса CalculatorModel.
     * Инициализирует переменную result значением 0.
     */
    public CalculatorModel() {
        this.result = 0;
    }

    /**
     * Выполняет операцию сложения двух чисел.
     *
     * @param firstNumber  Первое число
     * @param secondNumber Второе число
     */
    public void add(Number firstNumber, Number secondNumber) {
        result = firstNumber.doubleValue() + secondNumber.doubleValue();
    }

    /**
     * Выполняет операцию вычитания двух чисел.
     *
     * @param firstNumber  Первое число
     * @param secondNumber Второе число
     */
    public void subtract(Number firstNumber, Number secondNumber) {
        result = firstNumber.doubleValue() - secondNumber.doubleValue();
    }

    /**
     * Выполняет операцию умножения двух чисел.
     *
     * @param firstNumber  Первое число
     * @param secondNumber Второе число
     */
    public void multiply(Number firstNumber, Number secondNumber) {
        result = firstNumber.doubleValue() * secondNumber.doubleValue();
    }

    /**
     * Выполняет операцию деления двух чисел.
     *
     * @param firstNumber  Первое число
     * @param secondNumber Второе число
     * @throws IllegalArgumentException Если второе число равно нулю
     */
    public void divide(Number firstNumber, Number secondNumber) {
        if (secondNumber.doubleValue() != 0) {
            result = firstNumber.doubleValue() / secondNumber.doubleValue();
        } else {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
    }

    /**
     * Возвращает текущий результат вычислений.
     *
     * @return Текущий результат
     */
    public Number getResult() {
        return result;
    }

    /**
     * Устанавливает результат вычислений.
     *
     * @param result Результат
     */
    public void setResult(Number result) {
        this.result = result;
    }
}
