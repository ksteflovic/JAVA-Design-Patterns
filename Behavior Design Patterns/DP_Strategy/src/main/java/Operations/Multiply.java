package Operations;

/**
 * @author Kristína Šteflovičová
 * @created 13.04.2020 - 12:54
 */
public class Multiply implements Operator {
    @Override
    public int operate(int a, int b) {
        return a*b;
    }

    @Override
    public String getOperator() {
        return "*";
    }
}
