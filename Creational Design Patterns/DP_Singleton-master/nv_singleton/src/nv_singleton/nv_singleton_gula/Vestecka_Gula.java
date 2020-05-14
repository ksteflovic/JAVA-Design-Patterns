package nv_singleton.nv_singleton_gula;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * @author Kristína Šteflovičová
 * @created 09.04.2020 - 12:35
 */

public class Vestecka_Gula {
    // 🔮
    private volatile static Vestecka_Gula _INSTANCE = null;
    private static Random r = null;

    private Vestecka_Gula(){ }

    public static Vestecka_Gula getInstance(){
        if(_INSTANCE == null) {
            synchronized (Vestecka_Gula.class) {
                r = new Random();
                int rand_int = r.nextInt(3);
                switch (rand_int) {
                    case 0:
                        _INSTANCE = new OptimistickaGula();
                        break;
                    case 1:
                        _INSTANCE = new PesimistickaGula();
                        break;
                    case 2:
                        _INSTANCE = new Zaujimava_Gula();
                        break;
                    default:
                        _INSTANCE = new Vestecka_Gula();
                        break;
                }
            }
        }
        return _INSTANCE;
    }

    public String getOdpoved(){
        return "Kto vie...";
    }

    protected static List<String> subor_do_listu(String nazov_suboru){
        try {
            BufferedReader subor = new BufferedReader(new FileReader(nazov_suboru));
            List<String> list = new ArrayList<>();
            String s;
            while ((s = subor.readLine()) != null) {
                list.add(s);
            }
            Collections.shuffle(list);
            subor.close();
            return list;
        }
            catch(Exception ex){
                System.err.println(ex.getMessage());
        }
        return null;
    }

    private static class OptimistickaGula extends Vestecka_Gula {
        private static final List<String> predpovede = subor_do_listu("predpovede\\dobra_gula.txt");

        @Override
        public String getOdpoved() {
            return predpovede.get(0); // ziskaj prvy nahodny
        }
    }

    private static class PesimistickaGula extends Vestecka_Gula {
        private static final List<String> predpovede = subor_do_listu("predpovede\\zla_gula.txt");

        @Override
        public String getOdpoved() {
            return predpovede.get(0);
        }
    }

    private static class Zaujimava_Gula extends Vestecka_Gula {
        private static final List<String> predpovede = subor_do_listu("predpovede\\zaujimava_gula.txt");

        @Override
        public String getOdpoved() {
            return predpovede.get(0);
        }

    }

}
