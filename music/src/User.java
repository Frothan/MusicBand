import java.util.Scanner;

public class User {

    //create objects:
    Settings mySettings = new Settings();
    //Accordion myAccordion = new Accordion();
    Scanner scanner = new Scanner(System.in);

    //variables:
    public String finalInstrument;

//----------------------------------------------------------------------------------------------------------------------
    // 1
    public void userStart(){

        System.out.println("\nWelcome to a special and limited edition of Christo's Callcenter: MusicBand");
        whichInstrument(); // -->2
    }

//----------------------------------------------------------------------------------------------------------------------

    // 2
    public void whichInstrument() {
        System.out.println("\nWhich instrument do you want to listen?");
        String instrument = scanner.nextLine().toLowerCase();
        boolean trueFalse = mySettings.searchInstrument(mySettings.instrumentsA, instrument);
        if (trueFalse == true) {
            System.out.println("\nSelected instrument: " + instrument);
            this.finalInstrument = instrument;
            mySettings.setNameInstrument(finalInstrument);
            whichGenre(); // -->3
        } else {
            System.out.println("\nInstrument doesn't exist! \n Do you want to see the options?(Y/N)");
            String inputJN = scanner.nextLine();
            if (inputJN.equals("Y")) {
                for (String ins : mySettings.instrumentsA) {
                    System.out.print(ins + ", ");
                }
                System.out.println("\nEnter an instrument, which belongs to the upper list: ");
                whichInstrument();
            } else {
                System.out.println("\nOkay, bye.");
            }
        }
    }

//----------------------------------------------------------------------------------------------------------------------

    // 3
    public void whichGenre() {
        System.out.println("\nWhich genre do you want to listen?");
        String genre = scanner.nextLine().toLowerCase();
        boolean trueFalse = mySettings.searchGenre(mySettings.genresA, genre);
        if (trueFalse == true) {
            System.out.println("\nSelected genre: " + genre);
            whichOption(); // -->4
        } else {
            System.out.println("\nGenre doesn't exist!\nDo you want to see the options?(Y/N)");
            String inputJN = scanner.nextLine();
            if (inputJN.equals("Y")) {
                for (String gen : mySettings.genresA) {
                    System.out.print(gen + ", ");
                }
                System.out.println("\nEnter a genre, which belongs to the upper list: ");
                whichGenre();
            } else {
                System.out.println("\nOkay, bye.");
            }
        }
    }

//----------------------------------------------------------------------------------------------------------------------

    // 4
    public void whichOption() {
        System.out.println("\nChoose a option (enter a number)");
        int counter = mySettings.showCountOption();
        int option = scanner.nextInt();
        if ((option > 0) & (option <= counter)) {
            int place = option - 1;
            //FUNKTIONIERT NICHT
            System.out.println("\nYou chose option " + mySettings.optionsA[place]);

            switch (option) {
                case 1:
                    String instrument = null;
                    whichInstrument(); // -->2 (add Instrument)
                case 2:
                    callPlay(finalInstrument); // -->5.1 (Play)
                case 3:
                    whichVolume(); // -->5.2
                case 4:
                    System.out.println("Okay, bye.");
            }
        }
    }
//----------------------------------------------------------------------------------------------------------------------
    // 5.1
    public void callPlay(String finalInstrument) {
        System.out.println("\nEnter your playtime[s]:");
        int playtime = scanner.nextInt();
        System.out.println("\nSuper, you hear " + finalInstrument + playtime+ " seconds." );
        mySettings.
        mySettings.setVolumeInstrument(finalInstrument, volume);
        if (volume > 80) {
            System.out.println("\nWow, " + volume + "% of " + finalInstrument + ", that's loud! Let's Party!");
        } else if (volume < 30) {
            System.out.println("\n" + volume + "% of " + finalInstrument + " that's quiet...");
        } else {
            System.out.println("\nVolume of " + finalInstrument + ": " + volume + "%");
        }
        whichOption(); // -->4
    }


//----------------------------------------------------------------------------------------------------------------------
    // 5.2
    public void whichVolume() {
        System.out.println("\nEnter the volume (0-100):");
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
    }
//----------------------------------------------------------------------------------------------------------------------
}


