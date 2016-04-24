package vn.insurance.core.exception;

/**
 * Created by thangnguyen-imac on 4/23/16.
 */
public class UserNotFoundException extends Exception {

    public UserNotFoundException(String message){
        super(message);
    }

    public UserNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
