package ch11exception.book.B485;

public class NotExistIDException extends Exception{
    public NotExistIDException() {
    }
    public NotExistIDException(String message) {
        super(message);
    }
}
