package question2;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void displayBalance(){
        System.out.println("Account Number :"+accountNumber);
        System.out.println("Account Balance :"+balance);
    }

    public void deposit(double amount){
        if(amount <=0){
            throw new IllegalArgumentException("Deposite Amount Must be Positive");
        }
        balance +=amount;
        System.out.println("Deposited Amount : " +amount+ ", Balance : "+balance);

    }

    public void withdraw(double amount){
        if(amount <=0){
            throw new IllegalArgumentException("Withdraw Amount Must be Positive");
        }
        if(amount >balance){
            throw new IllegalArgumentException("Insuffient Balance ");
        }
        balance-=amount;
        System.out.println("Withdraw : "+amount +", New Balance : "+balance);
    }
}
