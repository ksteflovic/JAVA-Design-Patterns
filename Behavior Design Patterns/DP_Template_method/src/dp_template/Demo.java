package dp_template;

/**
 *
 * @author KI
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // postupnost retazcov s menami vstupnych suborov a vystupneho suboru
        // mozeme zadat na prikazovom riadku (v NetBeans sa daju argumenty
        // metody main() urcit vo vlastnostiach projektu - Properties-Run-Arguments)
        
        // teraz pracujeme so subormi in1.txt in2.txt in3.txt in4.txt out.txt
        // na vstupe musia byt aspon dva subory
        if (args.length < 2) {
            return;
        }

        MyFileProcessor fp = new MyFileProcessor(args);
        fp.processAllIntputFiles();
    }

}
