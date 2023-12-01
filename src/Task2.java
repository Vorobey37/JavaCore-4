public class Task2 {

    public static void main(String[] args) {

        try {
            Account myCreditAccount = CreditAccount.createAccount();
            Account myDebitAccount = DebitAccount.createAccount(10000);
            Transaction.createTransaction(myDebitAccount, myCreditAccount, 1800);
            System.out.println(myCreditAccount);
            System.out.println(myDebitAccount);
            System.out.println(myCreditAccount.getTransactions());
            System.out.println(myDebitAccount.getTransactions());
        } catch (InsufficientFundsException e){
            System.out.println("Операция не выполнена, причина: " + e.getMessage());
        } catch (IllegalArgumentException e){
            System.out.println("Операция не выполнена, причина: " + e.getMessage());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
