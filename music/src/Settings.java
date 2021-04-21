import java.util.Scanner;

public class Settings {
    //ARRAY'S:
    String[] genresA = {"rock","blues","klassik","pop","country", "hipHop","jazz","metal","techno"};
    String[] instrumentsA = {"accordion", "drums","electric guitare","guitare","piano","saxophone","triangle","trumpet"};
    String[] optionsA = {"1: add another instrument","2: Start playing","3: set Volume", "4: Exit"};

    //OBJECT'S:
    Scanner scanner = new Scanner(System.in);  // Create a Scanner object
    Accordion myAccordion = new Accordion();
    Drums myDrums = new Drums();
    ElectricGuitare myElectricGuitare = new ElectricGuitare();
    Guitare myGuitare = new Guitare();
    Piano myPiano = new Piano();
    Saxophone mySaxophone = new Saxophone();
    Triangle myTriangle = new Triangle();
    Trumpet myTrumpet = new Trumpet();


    //VARIABLE'S:
    String input;

//=================================================================================================================START
// I N S T R U M E N T

    public boolean searchInstrument(String[] instrumentsA, String instrument){
        boolean found = false;
        for(int i = 0; i < instrumentsA.length; i++) {
            if(instrumentsA[i].equals(instrument)) {
                found=true;
            }
        }
        return found; //wird gespeichert in trueOrfalse
    }
//-----------------------------------------------------------

    public void setVolumeInstrument(String finalInstrument, int volume){

        switch (finalInstrument){
            case "accordion" -> myAccordion.setVolume(volume);
            case "drums" -> myDrums.setVolume(volume);
            case "electric guitare" -> myElectricGuitare.setVolume(volume);
            case "guitare" -> myGuitare.setVolume(volume);
            case "piano" -> myPiano.setVolume(volume);
            case "saxophone" -> mySaxophone.setVolume(volume);
            case "triangle" -> myTriangle.setVolume(volume);
            case "trumpet" -> myTrumpet.setVolume(volume);
        }
    }
//===================================================================================================================END

//=================================================================================================================START
// G E N R E

    public boolean searchGenre(String[] genresA, String genre){
        boolean found = false;
        for(int i = 0; i < genresA.length; i++) {
            if(genresA[i].equals(genre)) {
                found=true;
            }
        }
        return found; //wird gespeichert in trueOrfalse
    }
//===================================================================================================================END

//=================================================================================================================START
// O P T I O N

    public int showCountOption(){
        int counter = 0;
        for (String opt: optionsA) {
            System.out.println(opt);
            counter ++;
        }
        return counter;
    }
//===================================================================================================================END

//=================================================================================================================START
// N A M E

    public void setNameInstrument(String finalInstrument){

        switch (finalInstrument){
            case "accordion": myAccordion.setName(finalInstrument);
            case "drums": myDrums.setName(finalInstrument);
            case "electric guitare": myElectricGuitare.setName(finalInstrument);
            case "guitare": myGuitare.setName(finalInstrument);
            case "piano": myPiano.setName(finalInstrument);
            case "saxophone": mySaxophone.setName(finalInstrument);
            case "triangle": myTriangle.setName(finalInstrument);
            case "trumpet": myTrumpet.setName(finalInstrument);
        }
    }
//===================================================================================================================END

//=================================================================================================================START
// P L A Y

    public void callPlay(String finalInstrument, int playtime){

        switch (finalInstrument){
            case "accordion": myAccordion.play("music/piano/piano01.mp3");
            case "drums": myDrums.play("music/piano/piano01.mp3");
            case "electric guitare": myElectricGuitare.play("music/piano/piano01.mp3");
            case "guitare": myGuitare.play("music/piano/piano01.mp3");
            case "piano": myPiano.play("music/piano/piano01.mp3");
            case "saxophone": mySaxophone.play("music/piano/piano01.mp3");
            case "triangle": myTriangle.play("music/piano/piano01.mp3");
            case "trumpet": myTrumpet.play("music/piano/piano01.mp3");
        }
    }
//===================================================================================================================END
}
