package wallet;

/**
 * @author Kristína Šteflovičová
 * @created 20.04.2020 - 11:03
 */
public class Wallet implements Cloneable{

    private Banknote[] b;
    private int countBanknote = 0;

    public Wallet(int capacity) {
        b = new Banknote[capacity];
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Wallet clone =(Wallet) super.clone();
        clone.b = new Banknote[b.length];
        for(int i = 0; i < countBanknote; i++)
            clone.b[i] = (Banknote) b[i].clone();
        return clone;
    }

    public void addBanknote(int value, String currency){
        if(countBanknote < b.length)
            b[countBanknote++] = new Banknote(value,currency);
    }

    public int getAmount(String currency){
        int amount = 0;
        for(int i = 0; i < countBanknote; i++){
            if(b[i].getCurrency().equals(currency))
                amount += b[i].getValue();
        }
        return amount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < countBanknote; i++)
            sb.append(b[i]).append("\n");
        sb.append("}");
        return "Wallet:\n{\n"+sb;
    }

    public void damageRandom(){
        int random = (int) (Math.random()*countBanknote);
        b[random].damage();
    }

}
