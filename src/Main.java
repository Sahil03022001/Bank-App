public class Main {
    public static void main(String[] args) {

        SBIAccount s1 = new SBIAccount("Sahil", "sahil0987", true, 10000);
        s1.deposit(500);
        s1.withdraw(1000);
        s1.changePassword("sahil0987", "sahil@1234");
        s1.getAccountNumber();
        s1.getUserDetails();
    }
}