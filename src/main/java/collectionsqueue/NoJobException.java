package collectionsqueue;

public class NoJobException extends Exception{

    public NoJobException() {
    }

    public NoJobException(String message) {
        super(message);
    }

    public NoJobException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoJobException(Throwable cause) {
        super(cause);
    }

    public NoJobException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
