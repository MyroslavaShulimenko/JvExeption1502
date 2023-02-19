package home1502;

public class WrongPasswordException extends Throwable {
    public WrongPasswordException(String wrong_password) {
        super(wrong_password);
    }

}