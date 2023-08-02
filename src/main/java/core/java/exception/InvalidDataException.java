package core.java.exception;

public class InvalidDataException extends Exception {


    public InvalidDataException(String str) {
        // calling the constructor of parent Exception
        super(str);
    }
}
