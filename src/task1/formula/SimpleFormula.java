package task1.formula;

import task1.formula.operators.Operator;

import java.util.ArrayList;
import java.util.Map;

/**
 * Created by airat on 01.11.16.
 */
public class SimpleFormula  implements Formula{
    private static ArrayList<Operator> operators = new ArrayList<>();
    private ArrayList formulaItems = new ArrayList();


    public SimpleFormula(String formula) {

    }

    @Override
    public double execute(Map<String, Double> parameters) {
        return 0;
    }
}
