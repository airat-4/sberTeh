package task1.formula.operators;

/**
 * Created by airat on 01.11.16.
 */
public interface Operator {
    double action(boolean leftOperand, double rightOperand);
    int getPriority();
    String getStringView();
}
