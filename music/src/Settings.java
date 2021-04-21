import java.util.Scanner;

public class Settings {
    //ARRAY'S:
    String[] genresA = {"rock","blues","klassik","pop","country", "hipHop","jazz","metal","techno"};
    String[] instrumentsA = {"accordion", "drums","electric guitare","guitare","piano","saxophone","triangle","trumpet"};
    String[] optionsA = {"1: add another instrument","2: Start playing","3: set Volume"};

    //OBJECT'S:
    Scanner scanner = new Scanner(System.in);  // Create a Scanner object
    Accordion myAccordion = new Accordion();

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
        if(finalInstrument == instrumentsA[0]){
            myAccordion.setVolume(volume);
        }else if(finalInstrument == instrumentsA[1]){
            //myDrums.setVolume(volume);
        }else if(finalInstrument == instrumentsA[2]){
            //myElectricGuitare.setVolume(volume);
        }else if(finalInstrument == instrumentsA[3]){
            //myGuitare.setVolume(volume);
        }else if(finalInstrument == instrumentsA[4]){
            //myPiano.setVolume(volume);
        }else if(finalInstrument == instrumentsA[5]){
            //mySaxophone.setVolume(volume);
        }else if(finalInstrument == instrumentsA[6]){
            //myTriangle.setVolume(volume);
        }else if(finalInstrument == instrumentsA[7]){
            //myTrumpet.setVolume(volume);
        }else{
            System.out.println("ERROR");
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
        if(finalInstrument == instrumentsA[0]){
            myAccordion.setName(finalInstrument);
        }else if(finalInstrument == instrumentsA[1]){
            //myDrums.setName(finalInstrument);
        }else if(finalInstrument == instrumentsA[2]){
            //myElectricGuitare.setName(finalInstrument);
        }else if(finalInstrument == instrumentsA[3]){
            //myGuitare.setName(finalInstrument);
        }else if(finalInstrument == instrumentsA[4]){
            //myPiano.setName(finalInstrument);
        }else if(finalInstrument == instrumentsA[5]){
            //mySaxophone.setName(finalInstrument);
        }else if(finalInstrument == instrumentsA[6]){
            //myTriangle.setName(finalInstrument);
        }else if(finalInstrument == instrumentsA[7]){
            //myTrumpet.setName(finalInstrument);
        }else{
            System.out.println("ERROR");
        }
    }
//===================================================================================================================END
}
