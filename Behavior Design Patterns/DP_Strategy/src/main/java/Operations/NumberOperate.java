package Operations;

import Numbers.Formatter;

/**
 * @author Kristína Šteflovičová
 * @created 13.04.2020 - 12:55
 */
public class NumberOperate {
    private int a, b;
    private Operator o;

    public NumberOperate(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "NumberOperate { " + a + " "+ o.getOperator()+" " + b + " = " + o.operate(a,b) + " }.";
    }

    public void show(){
        System.out.println(toString());
    }

    public void setOperator(Operator o) {
        this.o = o;
    }
}
