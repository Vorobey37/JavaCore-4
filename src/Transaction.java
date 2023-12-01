import java.util.Date;

public class Transaction {

    /**
     * Сумма транзакции
     */
    private double cash;
    /**
     * Счет с которого произвелась трнзакция
     */
    private Account account1;
    /**
     * Счет на который произвелась трнзакция
     */
    private Account account2;
    /**
     * Дата/время транзакции
     */
    private Date date;

    /**
     * Конструктор для создания объекта транзакции
     * @param cash Сумма транзакции
     * @param account1 Счет с которого произвелась трнзакция
     * @param account2 Счет на который произвелась трнзакция
     */
    public Transaction(double cash, Account account1, Account account2) {
        this.cash = cash;
        this.account1 = account1;
        this.account2 = account2;
        this.date = new Date();
    }

    /**
     * Создание транзакции
     * @param account1 Счет для списания
     * @param account2 Счет для зачисления
     * @param cash Сумма операции
     * @throws InsufficientFundsException
     * @throws IllegalArgumentException
     */
    public static void createTransaction(Account account1, Account account2, double cash) throws InsufficientFundsException, IllegalArgumentException{

        double transactionCash = account1.withdraw(cash);
        account2.deposit(transactionCash);
        Transaction transaction = new Transaction(cash, account1, account2);
        account1.addTransaction(transaction);
        account2.addTransaction(transaction);
        System.out.println("Транзакция успешно выполнена!");
        System.out.println(transaction);

    }

    /**
     * Текст, описывающий транзакцию
     * @return Текст транзакции
     */
    @Override
    public String toString() {
        return "Transaction{" +
                "cash=" + cash +
                ", account1=" + account1 +
                ", account2=" + account2 +
                ", date=" + date +
                '}';
    }
}
