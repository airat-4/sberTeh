package task1.formula;

import java.util.Map;

/**
 * Created by airat on 01.11.16.
 */
public class Operand {
    private String operand;

    public Operand(String operand){
        this.operand = operand.trim();
    }

    public double getValue(Map<String, Double> parameters){
        try {
            return Double.parseDouble(operand);
        }catch (NumberFormatException e){
            Double value = parameters.get(operand);
            if(value == null){
                throw new InvalidOperandException("no such parameter " + operand);
            }
            return value;
        }
    }
}
