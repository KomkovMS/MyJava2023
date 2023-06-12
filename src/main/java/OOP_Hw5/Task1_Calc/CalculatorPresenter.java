package OOP_Hw5.Task1_Calc;

/**
 * Презентер калькулятора, связующее звено между моделью и представлением.
 */
public class CalculatorPresenter {
    private CalculatorView view;
    private CalculatorModel model;

    /**
     * Конструктор класса CalculatorPresenter.
     *
     * @param view  Объект представления калькулятора
     * @param model Объект модели калькулятора
     */
    public CalculatorPresenter(CalculatorView view, CalculatorModel model) {
        this.view = view;
        this.model = model;
    }

    /**
     * Выполняет вычисление на основе ввода пользователя.
     * Получает числа и оператор от представления,
     * вызывает соответствующий метод модели для выполнения операции,
     * отображает результат на представлении.
     */
    public void performCalculation() {
        Number firstNumber = view.getInputNumber();
        char operator = view.getInputOperator();
        Number secondNumber = view.getInputNumber();

        switch (operator) {
            case '+':
                model.add(firstNumber, secondNumber);
                break;
            case '-':
                model.subtract(firstNumber, secondNumber);
                break;
            case '*':
                model.multiply(firstNumber, secondNumber);
                break;
            case '/':
                model.divide(firstNumber, secondNumber);
                break;
            default:
                System.out.println("Invalid operator");
                return;
        }

        view.displayResult(model.getResult());
    }
}
