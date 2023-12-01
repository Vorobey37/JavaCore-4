public class DebitAccount extends Account{

    /**
     * Создание дебетного счета
     * @param cash - сумма, вносимая при открытии счета (начальная сумма счета)
     * @return Новый дебетовый счет
     * @throws IllegalArgumentException
     */
    public static DebitAccount createAccount(double cash) throws IllegalArgumentException{
        if (cash < 0){
            throw new IllegalArgumentException("Счет не создан! Начальный баланс счета не может быть отрицательный!");
        }
        DebitAccount myAccount = new DebitAccount();
        System.out.println("Счет успешно создан");
        myAccount.deposit(cash);

        return myAccount;
    }

    /**
     * Текст, описывающий дебетовый счет
     * @return текст дебетового счета
     */
    @Override
    public String toString() {
        return "DebitAccount{" +
                "currentBalance=" + currentBalance +
                '}';
    }
}
