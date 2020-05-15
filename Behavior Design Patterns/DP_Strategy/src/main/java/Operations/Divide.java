package Operations;

/**
 * @author Kristína Šteflovičová
 * @created 13.04.2020 - 12:54
 */
public class Divide implements Operator {
    @Override
    public int operate(int a, int b) {
        try {
            return a/b;
        }
        catch (ArithmeticException ex){
            System.err.println("Do not divide with 0!");
            System.exit(0);
        }
        return 0;
    }

    @Override
    public String getOperator() {
        return "/";
    }
}
