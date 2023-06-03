package OOP_Sem2.Task1;

public class Numeric implements i_Oper {
    int start;
    int val;
    int prev;

    public Numeric() {
        start = 0;
        val = 0;
        prev = -2;
    }

    @Override
    public int getNext() {
        prev = val;
        val+=2;
        return val;
    }

    @Override
    public void reset() {
        prev = -2;
        val = 0;
        start = 0;
    }

    @Override
    public void setStart(int x) {
        start = x;
        val = x;
        prev = x - 2;
    }

    int getPrev() {
        return prev;
    }
}
