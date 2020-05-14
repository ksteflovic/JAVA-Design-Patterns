package homecinema;

// client (test class)
import javax.swing.JOptionPane;

public class HomeCinemaDemo {

    public static void main(String[] args) {
        // preparation of objects for creating a home cinema
        Amplifier amp = new Amplifier("Philips Amplifier");
        Tuner tuner = new Tuner("Philips  AM/FM Tuner", amp);
        DvdPlayer dvd = new DvdPlayer("Philips  DVD Player", amp);
        CdPlayer cd = new CdPlayer("Sony CD Player", amp);
        Projector projector = new Projector("LG Projector", dvd);
        Lights lights = new Lights("Ceiling Lights");
        Screen screen = new Screen("Projection Screen");
        PopcornPopper popper = new PopcornPopper("Popcorn Popper 🍿");

        // using the object of the prepared facade class ...
        HomeCinemaFacade homeCinema
                = new HomeCinemaFacade(amp, tuner, dvd, cd,
                        projector, screen, lights, popper);
        //... we reach the goal very easily,
        // we call the facade methods:
        homeCinema.watchMovie("Lords of Dogtown");
        homeCinema.endMovie();

        homeCinema.listenToCd("Nirvana - In Utero");
        homeCinema.endCd();
    }
}
