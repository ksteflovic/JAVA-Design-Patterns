package wallet;

/**
 * @author Kristína Šteflovičová
 * @created 20.04.2020 - 10:41
 */
public class Banknote implements Cloneable {

    private boolean state;
    private int value;
    private String currency;

    public Banknote(int value, String currency) {
        this.state = true;
        this.value = value;
        this.currency = currency;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public int getValue() {
        return value;
    }

    public String getCurrency() {
        return currency;
    }

    @Override
    public String toString() {
        return "Banknote = " + value + " " + currency + ", state = " + (state == true ? "new" : "damaged") + ".";
    }

    public void damage(){
        state = false;
    }

}
