package OOP_Hw6.Task2;

public class IntegerArrayPrinter implements ArrayPrinter<Integer> {
    public void printArray(Integer[] array) {
        for (Integer element : array) {
            System.out.println("Integer: " + element);
        }
    }
}
