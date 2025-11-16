package BankApplicaton;

public class Main {
    public static void main(String[] args) {

        Account a = new Account("121212", 0, "Abhay", "abhay@xyz.com", "1212121");

        a.DepositMoney(50);
        a.DepositMoney(150);

        a.WithDrawMoney(100);

    }
}