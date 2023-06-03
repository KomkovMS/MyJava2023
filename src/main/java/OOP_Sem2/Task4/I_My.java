package OOP_Sem2.Task4;

public interface I_My {
    int getUUserID();
    default int getAdminID() {
        return 1;
    }
}
