import java.util.Scanner;
import java.util.UUID;

public class SBIAccount implements Bank{

    private final String name;
    private final String accountNumber;
    private String password;
    private final boolean rememberMe;
    private int balance;

    public SBIAccount(String name, String password, boolean rememberMe, int balance) {
        this.name = name;
        this.password = password;
        this.rememberMe = rememberMe;
        this.balance = balance;
        this.accountNumber = String.valueOf(UUID.randomUUID());
    }

    public void getName() {
        System.out.println(name);
    }

    public void getAccountNumber() {
        System.out.println(accountNumber);
    }

    public void changePassword(String oldPassword, String newPassword) {
        if(this.password.equals(oldPassword)){
            this.password = newPassword;
            System.out.println("Password Changed");
        }
        else{
            System.out.println("Old Password entered is incorrect");
        }
    }

    public boolean isRememberMe() {
        return rememberMe;
    }

    public void getBalance(){
        if(isRememberMe()){
            System.out.println(balance);
        }
        else{
            System.out.println("Enter the password: ");
            Scanner sc = new Scanner(System.in);
            String passW = sc.next();
            if(passW.equals(password)){
                System.out.println(balance);
            }else{
                System.out.println("Wrong Password");
            }
        }
    }

    public void withdraw(int amount) {
        if(isRememberMe()){
            if(amount > balance){
                System.out.println("Insufficient Balance");
            }
            else{
                balance -= amount;
                System.out.println(amount+" debited from your account");
            }
        }
        else{
            System.out.println("Enter your password: ");
            Scanner sc = new Scanner(System.in);
            String passW = sc.next();
            if(passW.equals(password)){
                if(amount > balance){
                    System.out.println("Insufficient Balance");
                }
                else{
                    balance -= amount;
                    System.out.println(amount+" debited from your account");
                }
            }
            else{
                System.out.println("Wrong Password");
            }
        }
    }

    public void deposit(int amount) {
        if(isRememberMe()){
            balance += amount;
            System.out.println(amount+" Credited to your account");
        }
        else{
            System.out.println("Enter your password: ");
            Scanner sc = new Scanner(System.in);
            String passW = sc.next();
            if(passW.equals(password)){
                balance += amount;
                System.out.println(amount+" Credited to your account");
            }
            else{
                System.out.println("Wrong Password");
            }
        }
    }

    public void getUserDetails() {
        System.out.println("Name: "+name);
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Current Balance: "+balance);
    }
}
