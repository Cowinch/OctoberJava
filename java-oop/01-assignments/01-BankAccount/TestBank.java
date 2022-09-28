public class TestBank {
    public static void main(String[] args) {
        BankAccount user1=new BankAccount();
        BankAccount user2=new BankAccount();
        user1.depositMoney(60.00);
        user1.withdrawMoney(120.00);
        user1.showMeTheMoney();
        BankAccount.showTotalMoney();
        BankAccount.showAccountAmount();
    }
}
