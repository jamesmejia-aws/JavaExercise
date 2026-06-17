package exception;


/**
 * Thrown when operations are attempted on a frozen account.
 */
public class AccountFrozenException extends Exception {
    private String message;

    public AccountFrozenException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}