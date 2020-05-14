package nv_singleton.nv_singleton;

import nv_singleton.nv_singleton_gula.Vestecka_Gula;
import nv_singleton.nv_singleton_skrinky.Manazer_Skriniek;

import java.io.IOException;

public class SingletonDemo {

    public static void main(String[] args) {
        // cabinet_manager();
        // magic_crystal_ball();
    }

    public static void cabinet_manager(){
        Manazer_Skriniek m = Manazer_Skriniek.getInstance(100);
        m.obsad(5);
        m.obsad(0);
        m.obsad(2);
        m.obsad(1);
        m.obsad(10);
        m.obsad(10);
        m.obsad(55);
        System.out.println(m.getPocetSkriniek());
        System.out.println(m.getPocetVolnych());
        System.out.println(m.getPrvaVolna());
        m.uvolni(2);
        m.uvolni(11);
    }

    public static void magic_crystal_ball(){
        Vestecka_Gula g = Vestecka_Gula.getInstance();
        System.out.println(g.getOdpoved());

    }
}
