import java.util.Stack;

public class Account {

    /**
     * Текущий баланс
     */
    protected double currentBalance;
    /**
     * Стартовый баланс счета
     */
    protected static final int startBalance = 0;
    /**
     * Список операций по счету
     */
    protected Stack<Transaction> transactions;

    /**
     * Конструктор для создания счета
     */
    public Account() {
        this.currentBalance = startBalance;
        this.transactions = new Stack<>();

    }

    /**
     * Создание счета
     * @param cash - сумма, вносимая при открытии счета (начальная сумма счета)
     * @return Новый счет
     * @throws IllegalArgumentException
     */
    public static Account createAccount(double cash) throws IllegalArgumentException{
        if (cash < 0){
            throw new IllegalArgumentException("Счет не создан! Начальный баланс счета не может быть отрицательный!");
        }
        Account myAccount = new Account();
        System.out.println("Счет успешно создан");
        myAccount.deposit(cash);

        return myAccount;
    }

    /**
     * Внесение средств на счет
     * @param cash - сумма внесения
     * @throws IllegalArgumentException
     */
    public void deposit(double cash) throws IllegalArgumentException{
        if (cash <= 0){
            throw new IllegalArgumentException("Средства не внесены! Сумма вносимых средств не может быть отрицательной или нулевой");
        }
        currentBalance += cash;
        System.out.println("Счет успешно пополнен, сумма средств составляет: " + currentBalance);
        System.out.println();
    }

    /**
     * Снятие средств со счета
     * @param cash - сумма снятия
     * @return сумма снятия
     * @throws InsufficientFundsException
     * @throws IllegalArgumentException
     */
    public double withdraw(double cash) throws InsufficientFundsException, IllegalArgumentException {
        if (cash <= 0){
            throw new IllegalArgumentException("Сумма снимаемых средств не может быть отрицательной или нулевой в " + this + "!");
        }
        if(currentBalance < cash){
            throw new InsufficientFundsException("Недостаточно средств в " + this);
        }
        currentBalance -= cash;
        System.out.println("Снято со счета: " + cash + ", сумма средств составляет: " + currentBalance);
        System.out.println();
        return cash;
    }

    /**
     * Добавление транзакции по счету
     * @param transaction - выполненная транзакция
     */
    public void addTransaction(Transaction transaction){
        transactions.push(transaction);
    }

    /**
     * Возвращает сумму на счете(баланс)
     * @return текущий баланс
     */
    public double getCurrentBalance() {
        return currentBalance;
    }

    /**
     * Возвращает информацию о всех транзакциях
     * @return
     */
    public Stack<Transaction> getTransactions() {
        return transactions;
    }

    /**
     * Текст, описывающий счет
     * @return текст счета
     */
    @Override
    public String toString() {
        return "Account{" +
                "currentBalance=" + currentBalance +
                '}';
    }

}
