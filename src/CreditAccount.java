public class CreditAccount extends Account{

    /**
     * Стартовый баланс, одобренный банком
     */
    protected static final int startBalance = 100000;

    /**
     * Создание кредитного счета
     * @return Новый кредитный счет
     * @throws IllegalArgumentException
     */
    public static CreditAccount createAccount() throws IllegalArgumentException {
        if (startBalance < 0){
            throw new IllegalArgumentException("Счет не создан! Начальный баланс счета не может быть отрицательный!");
        }
        CreditAccount myAccount = new CreditAccount();
        myAccount.currentBalance = startBalance;
        System.out.println("Счет успешно создан, одобренная банком сумма на счете составляет " + myAccount.currentBalance);
        System.out.println();

        return myAccount;
    }

    /**
     * Текст, описывающий кредитный счет
     * @return текст кредитного счета
     */
    @Override
    public String toString() {
        return "CreditAccount{" +
                "currentBalance=" + currentBalance +
                '}';
    }
}
