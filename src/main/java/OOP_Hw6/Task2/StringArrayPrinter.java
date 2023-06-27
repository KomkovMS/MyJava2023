package OOP_Hw6.Task2;

public class StringArrayPrinter implements ArrayPrinter<String> {
    public void printArray(String[] array) {
        for (String element : array) {
            System.out.println("String: " + element);
        }
    }
}
