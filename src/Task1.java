public class Task1 {

    public static void main(String[] args) {

        try {
            Account myAccount = Account.createAccount(5555);
            myAccount.deposit(10000);
            double cash = myAccount.withdraw(11000);
            System.out.println(myAccount);
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        catch (InsufficientFundsException e){
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}