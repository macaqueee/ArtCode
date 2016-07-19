package design_patterns.social_network.exception;

/**
 * Created by macaque on 14.07.2016.
 */
public class InvalidLoginException extends Exception {
    public InvalidLoginException(String s) {
        super(s);
    }
}
