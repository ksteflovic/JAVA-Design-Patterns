package nv_adapter_uloha2;

import java.util.Enumeration;
import java.util.Vector;
import java.util.Iterator;

/**
 * @author KI
 */
public class Test {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // majme vektor naplneny retazcami
        // (predpokladame, ze sa s nim da pracovat len prostrednictvom rozhrania Enumeration)
        Vector data = new Vector();
        data.addElement("jar");
        data.addElement("leto");
        data.addElement("jesen");
        data.addElement("zima");



        Enumeration enumerator = new IteratorEnumeration(data.iterator());
        String element = "";
        while (enumerator.hasMoreElements()) {
            element = enumerator.nextElement().toString();
            System.out.println(element);
        }

/*
        // KLIENT:
        // vdaka adapteru s vektorom komunikujeme volanim metod
        // z rozhrania Iterator (adapter "preklada")
        Iterator it = new EnumerationIterator(data.elements());

        // spracovanie udajov ulozenych v kolekcii
        while (it.hasNext()) {
            String prvok = (String) it.next();
            System.out.println(prvok);

//            pokus o odstranovanie by vyvolal vynimku
            if (prvok.startsWith("j")) {
                //it.remove();
            }
        }
        */
    }
}
