public interface Bank {

    void getBalance();
    void withdraw(int amount);
    void deposit(int amount);
    void getName();
    void getAccountNumber();
    void changePassword(String oldPass, String newPass);
    void getUserDetails();
}