import java.util.*;

/* 
 * 1: Did not finish the while statement thats used to check 
 *  whether this account number already exists in generateAccountNumber.
 * 
 * 2: Did not add a System readline functionality for inserting
 *  a number that you're depositing/withdrawing in their
 *  coressponding methods.
*/
public class BankAccount {
    private double checkingBalance;
    private double savingsBalance;
    private String accountNumber;
    private static int numberOfAccounts;
    private static int totalMoney;

    // constructor
    public BankAccount() {
        numberOfAccounts++;
        accountNumber = generateAccountNumber();
        System.out.println("\nNew account created: "+accountNumber);
    }

    private String generateAccountNumber() {
        String newAccount = "";
        boolean isThisNew = false;
        String numbers = "0123456789";
        Random rand = new Random();
        while (isThisNew == false) {
            newAccount = "";
            for (int i = 0; i < 10; i++) {
                char randomNum = numbers.charAt(rand.nextInt(10));
                newAccount += randomNum;
            }
            // Did not build the logic for figuring out whether this number is new or not.
            isThisNew = true;
        }
        return newAccount;
    }

    // methods
    public void depositMoney(double money) {
        boolean ready = false;
        while (ready == false) {
            System.out.println("\nPlease specify the account: ");
            String account = System.console().readLine();
            switch (account) {
                case "checking":
                    //unsure how to verify whether a number was typed into the console or not, so I cannot execute this idea.
                    // System.out.println("\nPlease specify the amount for "+account+": ");
                    // String money = System.console().readLine();
                    this.checkingBalance += money;
                    totalMoney += money;
                    System.out.println("\nSuccessfully added " + money + " to your checking account");
                    ready = true;
                    break;

                case "savings":
                    this.savingsBalance += money;
                    totalMoney += money;
                    System.out.println("\nSuccessfully added " + money + " to your savings account");
                    ready = true;
                    break;

                default:
                    System.out.println(
                            "\nPleasse specify the account you would like to submit to:\n1) savings\n2) checking");
                    break;
            }
        }
    }

    public void withdrawMoney(double money) {
        boolean ready = false;
        while (ready == false) {
            System.out.println("\nPlease specify the account: ");
            String account = System.console().readLine();
            switch (account) {
                case "checking":
                    if (this.checkingBalance > money) {
                        this.checkingBalance -= money;
                        totalMoney -= money;
                        System.out.println("\nSuccessfully withdrew " + money + " from your checking account");
                        ready=true;
                    } else {
                        this.checkingBalance -= 5;
                        totalMoney -= 5;
                        System.out.println("\nInsufficient funds in Checking. Applying a $5 overdraft fee.");
                        ready=true;
                    }
                    break;
                case "savings":
                    if (this.savingsBalance > money) {
                        this.savingsBalance -= money;
                        totalMoney -= money;
                        System.out.println("\nSuccessfully withdrew " + money + " from your savings account");
                        ready=true;
                    } else {
                        this.savingsBalance -= 5;
                        totalMoney -= 5;
                        System.out.println("\nInsufficient funds in Savings. Applying a $5 overdraft fee.");
                        ready=true;
                    }
                    break;
                default:
                    System.out.println(
                            "\nPleasse specify the account you would like to submit to:\n1) savings\n2) checking");
                    break;
            }
        }
    }

    public void showMeTheMoney() {
        double sum = this.checkingBalance + this.savingsBalance;
        System.out.println("\nAccount Number: " + this.accountNumber);
        System.out.println("Checking: " + this.checkingBalance);
        System.out.println("Savings: " + this.savingsBalance);
        System.out.println("Total: " + sum + "\n");
    }

    public static void showAccountAmount() {
        System.out.println("\nTotal bank accounts: " + numberOfAccounts);
    }

    public static void showTotalMoney() {
        System.out.println("\nTotal money held: " + totalMoney);
    }

    // getter
    public double getChecking() {
        return this.checkingBalance;
    }

    public double getSavings() {
        return this.savingsBalance;
    }

    // setter
    public void setChecking(double checkingBalance) {
        this.checkingBalance = checkingBalance;
    }

    public void setSavings(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }
}
