package OOP_Hw5.Task1_Calc;

/*
1 - Конструируем калькулятор, применяя архитектуру MVP (Model-View-Presenter),
с возможностью выполнения базовых математических операций, таких как сложение,
вычитание, умножение и деление, работающий с дробными числами.
Доп. Задача (*) Мы также обеспечим обработку возможных ошибок, чтобы
предотвратить некорректные операции.
 */
public class Main {
    public static void main(String[] args) {
        CalculatorView view = new CalculatorView();
        CalculatorModel model = new CalculatorModel();
        CalculatorPresenter presenter = new CalculatorPresenter(view, model);

        presenter.performCalculation();
    }
}
