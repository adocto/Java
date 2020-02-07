public class SavingsAccount {

    int balance;

    public SavingsAccount(int initialBalance){
        balance = initialBalance;
    }
        //Check balance:
    public void checkBalance(int balance){
        int current = balance;
        System.out.println("Hello!");
        System.out.println("Your balance is " + current);
    }
        //Withdrawing:
    public void afterWithdraw(int balance){
        int afterWithdraw = balance - 300;
        balance = afterWithdraw;
        System.out.println("You just withdrew "+300);
    }
        //Deposit:
    public void afterDeposit(int balance){
        int afterDeposit = balance + 600;
        balance = afterDeposit;
        System.out.println("You just deposited "+600);
    }
        //Deposit:
    public void afterDeposit2(int balance){
        int afterDeposit2 = balance + 600;
        balance = afterDeposit2;
        System.out.println("You just deposited "+600);
    }
    public static void main(String[] args){
        SavingsAccount savingsTest = new SavingsAccount(2000);
        //savingsTest should have balance 2000
        savingsTest.checkBalance(savingsTest.balance);
        //savingsTest balance is printed
        savingsTest.afterWithdraw(savingsTest.balance);
        //withdrawal printed
        savingsTest.checkBalance(savingsTest.balance);
        savingsTest.afterDeposit(savingsTest.balance);
        //deposit printed
        savingsTest.checkBalance(savingsTest.balance);
        savingsTest.afterDeposit2(savingsTest.balance);
        //Check deposit2


    }
}
