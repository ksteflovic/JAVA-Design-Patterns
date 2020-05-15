/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dp_command.gadgets;

/**
 *
 * @author KI
 */
public class CDplayer  {

    public static final int OFF = -1;
    public static final int MUTED = 0;
    public static final int LOW = 1;
    public static final int DEFAULT = 2;
    public static final int HIGH = 3;

    private int volume;

    private static final String[] cds = {"Nirvana - Nevermind", "System of a Down - Toxicity", "Pearl Jam - Ten",
            "Red Hot Chilli Peppers - Californication", "Eminem - The Slim Shady LP", "Green Day - American Idiot", "Demi Lovato - Unbroken",
            "The FatRat - Jackpot", "Slipknot - Iowa", "Linkin park - Meteora", "Evanescence - Fallen", "Rammstein - Mutter", "Marika Gombitová - Ateliér duše"};

    private int cd_index;

    public CDplayer(){
        cd_index = 0;
    }

    public void on(){
        System.out.println("CD player on.");
    }

    public void off(){
        System.out.println("CD player off.");
    }

    public void play() {
        if(volume!=OFF) {
            volume = DEFAULT;
            random();
            System.out.println("▶ Playing CD: " + cds[cd_index] + " 🎶");
        }
        else
            System.err.println("CD player is off, cannot play music when off.");
    }

    public void stop() {
        volume = MUTED;
        System.out.println("⏹ CD player stopped.");
    }

    public void random() {
         cd_index = (int)(Math.random()*cds.length);
    }
    
    public void setCD(int which_one) {
        if (which_one>0 && which_one < cds.length) {
            cd_index = which_one;
        }
    }

    public int getCD() {
        return cd_index;
    }

    public void volumeUp() {
        if (volume != OFF) {
            if (volume == MUTED || volume == LOW || volume == DEFAULT) {
                volume++;
            }
            System.out.println("🔊 CD player is on, volume: " + volume);

        } else {
            System.out.println("CD player is off.");
        }

    }

    public void volumeDown() {
        if (volume != OFF) {
            if (volume == DEFAULT || volume==HIGH) {
                volume--;
            }
            System.out.println("CD player is on, volume: " + volume);
        } else {
            System.out.println("CD player is off.");
        }
    }

    public int getVolume() {
        return volume;
    }
}