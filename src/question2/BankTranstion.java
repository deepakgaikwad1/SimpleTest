package question2;

public class BankTranstion {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount("123456",500);

        try{
            bankAccount.deposit(200);
            bankAccount.withdraw(100);
            bankAccount.withdraw(700);
        }catch (IllegalArgumentException e){
            System.out.println("Transaction error :"+e.getMessage());
        }

        try{
            bankAccount.deposit(-500);
        }catch (IllegalArgumentException e){
            System.out.println("Transaction error :"+e.getMessage());
        }


        bankAccount.displayBalance();


    }
}
