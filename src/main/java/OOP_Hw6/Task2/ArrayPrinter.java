package OOP_Hw6.Task2;

public interface ArrayPrinter<T> {
    void printArray(T[] array);
}

public class GenericMethodExample<T> implements ArrayPrinter<T> {
    public void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }
}

public class IntegerArrayPrinter implements ArrayPrinter<Integer> {
    public void printArray(Integer[] array) {
        for (Integer element : array) {
            System.out.println("Integer: " + element);
        }
    }
}

public class StringArrayPrinter implements ArrayPrinter<String> {
    public void printArray(String[] array) {
        for (String element : array) {
            System.out.println("String: " + element);
        }
    }
}