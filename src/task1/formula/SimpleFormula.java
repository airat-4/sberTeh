package task1.formula;

import task1.formula.operators.Operator;

import java.util.ArrayList;
import java.util.Map;

/**
 * Created by airat on 01.11.16.
 */
public class SimpleFormula  implements Formula{
    private static ArrayList<Operator> operators = new ArrayList<>();
    private ArrayList<Object> formulaItems = new ArrayList<>();


    public SimpleFormula(String formula) {
        formula = dividedItemsWithSpace(formula);
        String[] items = formula.split("\\s+");
        addItems(items);
        for (String item : items) {
            if (isSuchOperator(item)) {
                formulaItems.add(getOperator(item));
            } else {
                formulaItems.add(new Operand(item));
            }
        }
    }

    private void addItems(String[] items) {
        for (String item : items) {
            if (isSuchOperator(item)) {
                formulaItems.add(getOperator(item));
            } else {
                formulaItems.add(new Operand(item));
            }
        }
    }

    private String dividedItemsWithSpace(String formula) {
        for (Operator operator : operators) {
            formula = formula.replace(operator.getStringView(), " " + operator.getStringView() + " ");
        }
        return formula;
    }

    private Operator getOperator(String item) {
        for (Operator operator : operators) {
            if(item.equals(operator.getStringView())){
                return operator;
            }
        }
        return null;
    }

    private boolean isSuchOperator(String item) {
        for (Operator operator : operators) {
            if(item.equals(operator.getStringView())){
                return true;
            }
        }
        return false;
    }

    @Override
    public double execute(Map<String, Double> parameters) {
        return 0;
    }
}
