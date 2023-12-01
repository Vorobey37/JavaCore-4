public class InsufficientFundsException extends RuntimeException {
    /**
     * Исключение для случаев, когда недостаточно средств на счету
     */
    public InsufficientFundsException(String message) {
        super(message);
    }
}
