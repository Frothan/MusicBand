import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class User {

    //OBJECT's:
    Settings mySettings = new Settings();
    Scanner scanner = new Scanner(System.in);

    MusicPlayer musicPlayer = new MusicPlayer();

    //variables:
    public String finalInstrument;
    boolean exist;

//----------------------------------------------------------------------------------------------------------------------
    // 1
    public void userStart(){

        System.out.println("\nWelcome to a special and limited edition of Christo's Callcenter: MusicBand");
        whichInstrument(); // -->2
    }

//----------------------------------------------------------------------------------------------------------------------
    // 2
    public void whichInstrument() {
        System.out.println("\nWhich instrument do you want to listen?" + " " + "Please choose one of the following:");
        System.out.println("List of all instruments: ");
        for (String inst : mySettings.instrumentsA) {
            System.out.println(inst);
        }
        try{
            String instrument = scanner.nextLine().toLowerCase();
            exist = mySettings.searchInstrument(mySettings.instrumentsA, instrument);
            if (exist) {
                System.out.println("\nSelected instrument: " + instrument);
                this.finalInstrument = instrument;
                mySettings.setNameInstrument(finalInstrument);
                whichGenre(); // -->3
            } else {
                System.out.println("\nInstrument doesn't exist!\nDo you want to see the options?(y/n)");
                String inputJN = scanner.nextLine().toLowerCase();
                if (inputJN.equals("y")) {
                    whichInstrument();
                } else {
                    System.out.println("\nOkay, bye.");
                }
            }
        }catch(InputMismatchException e){
            System.out.println("\ninvalid input!");
        }
    }

//----------------------------------------------------------------------------------------------------------------------

    // 3
    public void whichGenre() {
        System.out.println("\nWhich genre do you want to listen?");
        System.out.println("List of all genres: ");
        for (String genres : mySettings.genresA) {
            System.out.println(genres);
        }
        String genre = scanner.nextLine().toLowerCase();
        exist = mySettings.searchGenre(mySettings.genresA, genre);
        if (exist) {
            System.out.println("\nSelected genre: " + genre);
            whichOption(); // -->4
        } else {
            System.out.println("\nGenre doesn't exist!\nDo you want to see the options?(y/n)");
            String inputJN = scanner.nextLine().toLowerCase();
            if (inputJN.equals("y")) {
                whichGenre();
            } else {
                System.out.println("\nOkay, bye.");
            }
        }
    }

//----------------------------------------------------------------------------------------------------------------------

    // 4
    public void whichOption() {
        System.out.println("\nChoose an option (enter a number):");
        int counter = mySettings.showCountOption();
        try {
            int option = scanner.nextInt();
            if ((option > 0) & (option <= counter)) {
                int place = option - 1;
                System.out.println("\nYou chose option " + mySettings.optionsA[place]);

                switch (option) {
                    case 1:
                        whichInstrument(); // -->2 (add Instrument)
                    case 2:
                        callPlay(finalInstrument); // -->5.1 (Play)
                        whichOption();
                    case 3:
                        whichVolume(); // -->5.2
                    case 4:
                        System.exit(0);
                }
            }
        }catch(InputMismatchException e) {
            System.out.println("\ninvalid input! Next time you have to enter a number!");
        }
    }
//----------------------------------------------------------------------------------------------------------------------
    // 5.1
    public void callPlay(String finalInstrument) {
        System.out.println("\nEnter your playtime[s]:");
        try{
            int playtime = scanner.nextInt();
            System.out.println("\nSuper, you hear " + finalInstrument + " " + "for " + playtime + " seconds." );
            mySettings.callPlay(finalInstrument, playtime);
            whichOption(); // -->4
        }catch(InputMismatchException e){
            System.out.println("\ninvalid input! Next time you have to enter a number!");
        }
    }

//----------------------------------------------------------------------------------------------------------------------
    // 5.2
    public void whichVolume() {
        System.out.println("\nEnter the volume (0-100):");
        try{
            int volume = scanner.nextInt();
            mySettings.setVolumeInstrument(finalInstrument, volume);
            if (volume > 80) {
                System.out.println("\nWow, " + volume + "% of " + finalInstrument + ", that's loud! Let's Party!");
            } else if (volume < 30) {
                System.out.println("\n" + volume + "% of " + finalInstrument + " that's quiet...");
            } else {
                System.out.println("\nVolume of " + finalInstrument + ": " + volume + "%");
            }
            whichOption(); // -->4
        }catch(InputMismatchException e){
            System.out.println("\ninvalid input! Next time you have to enter a number!");
        }
    }
//----------------------------------------------------------------------------------------------------------------------
}


