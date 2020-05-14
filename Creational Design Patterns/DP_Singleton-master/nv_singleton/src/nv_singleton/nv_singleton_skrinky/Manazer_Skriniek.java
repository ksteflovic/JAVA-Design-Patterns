package nv_singleton.nv_singleton_skrinky;

import java.util.stream.IntStream;

/**
 * @author Kristína Šteflovičová
 * @created 09.04.2020 - 12:33
 */

public class Manazer_Skriniek {
    // 🗄️🗄️🗄️🗄️🗄️🗄️ ...
    public static Manazer_Skriniek _INSTANCE = null;
    private static final int _COUNT = 10; // pocet skriniek, ak bez parametra
    private boolean[] skrinka;

    private Manazer_Skriniek(int n){
        skrinka = new boolean[n];
        for(int i = 0; i < n; i++)
            skrinka[i] = true;
    }

    public static Manazer_Skriniek getInstance(){
        if(_INSTANCE ==null)
            // ja si urcim 50 skriniek
            return new Manazer_Skriniek(_COUNT);
        return _INSTANCE;
    }

    public static Manazer_Skriniek getInstance(int n){
        if(_INSTANCE ==null)
            return new Manazer_Skriniek(n);
        return _INSTANCE;
    }

    public int getPocetSkriniek(){
        return skrinka.length;
    }

    public int getPocetVolnych(){
        return (int) IntStream.range(0, skrinka.length)
                .filter(i -> skrinka[i])
                .boxed()
                .count();
    }

    public int getPrvaVolna(){
        return IntStream.range(0, skrinka.length)
                .filter(i -> skrinka[i])
                .findFirst()
                .orElse(-1); // Vrati -1 ak ziadna skrinka nie je volna
    }

    public void obsad(int cislo_skrinky){
        // mame skrinky od 0 po n
        if(cislo_skrinky>-1 && cislo_skrinky<getPocetSkriniek()) { // zistim ci skrinka s takym cislom existuje
            if (skrinka[cislo_skrinky]) { // zistim ci je skrinka volna
                skrinka[cislo_skrinky] = false;
                System.out.println("Skrinka s cislom " + cislo_skrinky + ". bola uspesne obsadena.");
            }
            else
                System.out.println("Skrinka s cislom "+cislo_skrinky+". je uz obsadena.");
        }
        else
            System.out.println("Skrinka s uvedenym cislom neexistuje.");
    }

    public void uvolni(int cislo_skrinky){
        if(cislo_skrinky>0 && cislo_skrinky<getPocetSkriniek())
            if(!skrinka[cislo_skrinky]) {
                skrinka[ cislo_skrinky]=true;
                System.out.println("Skrinka s cislom " + cislo_skrinky + ". bola uspesne uvolnena.");
            }
            else
                System.out.println("Skrinka s cislom " + cislo_skrinky + ". je uz prazdna.");

        }


    //   ╔══════════════════╦══════════════════╦══════════════════╦══════════════════╗
    //   ║    __________    ║    __________    ║    __________    ║    __________    ║
    //   ║    __________    ║    __________    ║    __________    ║    __________    ║
    //   ║    __________    ║    __________    ║    __________    ║    __________    ║
    //   ║                  ║                  ║                  ║                  ║
    //   ║         1        ║         2        ║         3        ║         4        ║
    //   ║                  ║                  ║                  ║                  ║        ...
    //   ║             🔒   ║             🔒   ║             🔓   ║            🔒    ║
    //   ║                  ║                  ║                  ║                  ║
    //   ║                  ║                  ║                  ║                  ║
    //   ║    __________    ║    __________    ║    __________    ║    __________    ║
    //   ║    __________    ║    __________    ║    __________    ║    __________    ║
    //   ║                  ║                  ║                  ║                  ║
    //   ╚══════════════════╩══════════════════╩══════════════════╩══════════════════╝
    //
    //              🅣🅗🅔🅡🅔'🅢 🅟🅛🅔🅝🅣🅨 🅞🅕 🅡🅞🅞🅜 🅐🅣 🅣🅗🅔 🅑🅞🅣🅣🅞🅜
}
