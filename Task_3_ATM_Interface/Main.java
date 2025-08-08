package Task_3_ATM_Interface;

public class Main {
    public static void main(String[] args) {
        BankAccount userAccount = new BankAccount(1000.00); // Initial balance
        ATM atm = new ATM(userAccount);
        atm.start();
    }
}
