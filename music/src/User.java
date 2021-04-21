import java.util.Scanner;

public class User {

    Settings mySettings = new Settings();
    //Accordion myAccordion = new Accordion();
    Scanner scanner = new Scanner(System.in);

    //variables:
    String finalInstrument;

//----------------------------------------------------------------------------------------------------------------------
    // 1
    public void userStart(){

        System.out.println("Welcome to a special and limited edition of Christo's Callcenter: MusicBand");
        whichInstrument(); // -->2
    }

//----------------------------------------------------------------------------------------------------------------------

    // 2
    public void whichInstrument() {
        System.out.println("Which instrument do you want to listen?");
        String instrument = scanner.nextLine().toLowerCase();
        boolean trueFalse = mySettings.searchInstrument(mySettings.instrumentsA, instrument);
        if (trueFalse == true) {
            System.out.println("Selected instrument: " + instrument);
            String finalInstrument = instrument;
            whichGenre(); // -->3
        } else {
            System.out.println("Instrument doesn't exist! \n Do you want to see the options?(Y/N)");
            String inputJN = scanner.nextLine();
            if (inputJN.equals("Y")) {
                for (String ins : mySettings.instrumentsA) {
                    System.out.print(ins + ", ");
                }
                System.out.println("\nEnter an instrument, which belongs to the upper list: ");
                whichInstrument();
            } else {
                System.out.println("Okay, bye.");
            }
        }
    }

//----------------------------------------------------------------------------------------------------------------------

    // 3
    public void whichGenre() {
        System.out.println("Which genre do you want to listen?");
        String genre = scanner.nextLine().toLowerCase();
        boolean trueFalse = mySettings.searchGenre(mySettings.genresA, genre);
        if (trueFalse == true) {
            System.out.println("Selected genre: " + genre);
            whichOption(); // -->4
        } else {
            System.out.println("Genre doesn't exist!\nDo you want to see the options?(Y/N)");
            String inputJN = scanner.nextLine();
            if (inputJN.equals("Y")) {
                for (String gen : mySettings.genresA) {
                    System.out.print(gen + ", ");
                }
                System.out.println("\nEnter a genre, which belongs to the upper list: ");
                whichGenre();
            } else {
                System.out.println("Okay, bye.");
            }
        }
    }

//----------------------------------------------------------------------------------------------------------------------

    // 4
    public void whichOption(){
        System.out.println("Choose a option (enter a number)");
        int counter = mySettings.showCountOption();
        int option = scanner.nextInt();
        if((option > 0) & (option <= counter)){
            int place = option - 1;
            //FUNKTIONIERT NICHT
            System.out.println("You chose option " + mySettings.optionsA[place]);

            if(place == 0){
                String instrument = null;
                whichInstrument(); // -->2 (add Instrument)
            }else if(place == 1){
                System.out.println("Hier wird Methode aufgerufen 1");
                Piano myPiano = new Piano();
                myPiano.play("music/piano/piano01.mp3");// -->5.1 (Play)
            }else{
                whichVolume(); // -->5.2
            }
        }else{
            System.out.println("invalid option");
            whichOption();
        }
    }

//----------------------------------------------------------------------------------------------------------------------
    // 5.2
    public void whichVolume() {
        System.out.println("Enter the volume (0-100):");
        int volume = scanner.nextInt();
        mySettings.setVolumeInstrument(finalInstrument, volume);
        if (volume > 80) {
            System.out.println("Wow, " + volume + "% of " + finalInstrument + ", that's loud! Let's Party!");
        } else if (volume < 30) {
            System.out.println(volume + "% of " + finalInstrument + " that's quiet...");
        } else {
            System.out.println("Volume of ss " + finalInstrument + ": " + volume + "%");
        }
        whichOption(); // -->4
    }
//----------------------------------------------------------------------------------------------------------------------


//Bismillah code
/*
    // Class User variables
    String input = "";

    // Objects instantiation
   // Create a Scanner object
    Settings musicSettings = new Settings();
    instrumentSettings instrumentList= new instrumentSettings();





    public void startTheProgram() {
        do {
            System.out.println("To play an instrument please choose from one of the following genres:");
            System.out.println("Genres list : ");
            for (String genres : musicSettings.genresA) {
                System.out.println(genres);
            }
            //musicSettings.searchGenre(musicSettings.genresA, );

            System.out.println("Now What kind of instrument would you like to play");

            instrumentList.getInstrument();

            System.out.println("Piano and Accordion ");
            input = scanner.nextLine().toLowerCase();

            System.out.println("To end the program please enter end:");
            System.out.println("---------------------------------------------------");

        }
        while (!input.equals("end"));
    }

 */
}

