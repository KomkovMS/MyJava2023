package OOP_Sem2.Task4;

public class My_Class implements I_My {
    @Override
    public int getUUserID() {
        return 100;
    }

    @Override // переопределение
    public int getAdminID() {
        return 2;
    }
}
