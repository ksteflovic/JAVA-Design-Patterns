package wallet;

/**
 * @author Kristína Šteflovičová
 * @created 20.04.2020 - 10:43
 */
public class Test {

    // €, $, £, ¥
    // Shallow copy - skopiruje sa, ale ak poskodim jednu, poskodi sa aj v kopii
    // Deep copy - skopiruje sa, ale vytvoria sa dve rozne polia a tak sa pri poskodeni jednej, druha penazenka neposkodi

    public static void main(String[] args) {
        Wallet w1 = new Wallet(10);
        w1.addBanknote(10,"€");
        w1.addBanknote(5,"€");
        w1.addBanknote(10,"€");
        w1.addBanknote(10,"€");
        w1.addBanknote(100,"£");
        w1.addBanknote(20,"€");

        // System.out.println(w1.getAmount("€"));
        System.out.println(w1);

        Wallet w2 = null;
        try {
            w2 = (Wallet) w1.clone();
        } catch (CloneNotSupportedException e){
            e.printStackTrace();
        }

        System.out.println(w2);
        w1.addBanknote(10, "$");
        w2.addBanknote(500, "€");
        w1.damageRandom();
        System.out.println("===================");
        System.out.println(w1);
        System.out.println(w2);

      /*  Banknote b1 = new Banknote(10, "€");
        System.out.println(b1);

        Banknote b2 = null;
        try {
            b2 = (Banknote) b1.clone();
        } catch (CloneNotSupportedException e) {
            System.err.println(e.getMessage());
        }
        b1.damage();
        System.out.println(b1);
        System.out.println(b2);
       */
    }

}
