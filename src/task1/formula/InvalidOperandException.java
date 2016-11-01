package task1.formula;

/**
 * Created by airat on 01.11.16.
 */
public class InvalidOperandException extends RuntimeException {
    public InvalidOperandException(String message){
        super(message);
    }
}
