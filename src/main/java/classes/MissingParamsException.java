package classes;

public class MissingParamsException extends Exception {

    public MissingParamsException() {
        super();
    }

    public MissingParamsException(String msg) {
        super(msg);
    }
}
