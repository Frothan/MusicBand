import java.util.Scanner;

public class instrumentSettings {
    String input;
    boolean instrumentExistOrNot;
    boolean found;

    String[] instruments = {"piano", "accordion"};

    Piano instPiano = new Piano();
    Accordion instAccordion = new Accordion();
    Drums instDrums = new Drums();
    ElectricGuitare instElectricGuitare = new ElectricGuitare();
    Guitare instGuitare = new Guitare();
    Saxophone instSaxophone = new Saxophone();
    Triangle instTriangle = new Triangle();
    Trumpet instTrumpet = new Trumpet();

    Scanner scanner = new Scanner(System.in);  // Create a Scanner object


    public void getInstrument() {
        System.out.println("Welches Instrument möchtest du hören?");
         input = scanner.nextLine().toLowerCase();  // Read user input
        existInstrument(input);

    }


    public void existInstrument(String input){
       instrumentExistOrNot = contains(instruments, input); //Methode wird aufgerufen

        //--------------------------------------------------------------------------------------------------------------
        //Das Kann in User Class übernommen werden!
        if(instrumentExistOrNot){
            System.out.println("Super, du möchtest " + input + " hören.");// Output user input

            switch (input) {
                case "piano" -> instPiano.play("piano\\piano01.mp3");
                /*
                case "accordion" -> instAccordion.play("piano\\piano01.mp3");
                case "drums" -> instDrums.play("piano\\piano01.mp3");
                case "electricGuitare" -> instElectricGuitare.play("piano\\piano01.mp3");
                case "guitare" -> instGuitare.play("piano\\piano01.mp3");
                case "saxophone" -> instSaxophone.play("piano\\piano01.mp3");
                case "triangle" -> instTriangle.play("piano\\piano01.mp3");
                case "trumpet" -> instTrumpet.play("piano\\piano01.mp3");

                 */
            }



        }else{
            System.out.println("Das Instrument " + input + " existiert nicht. \n Möchtest Du die Auswahl ansehen? (J/N)");
            String inputJN = scanner.nextLine();
            if(inputJN.equals("J")){
                for (String instrumentsList : instruments) {
                    System.out.println(instrumentsList + "\n");
                }
                System.out.println("Gib ein Instrument ein, dass zur Auswahl steht: ");
                String inputInstrument2 = scanner.nextLine();
                existInstrument(inputInstrument2);
            }else{
                System.out.println("Okay, tschüss.");
            }
        }
        //--------------------------------------------------------------------------------------------------------------
    }

    protected boolean contains(String[] instruments, String input){
        found = false;
        for(int i = 0; i < instruments.length; i++) {
            if(instruments[i].equals(input)) {
                found = true;
            }
        }
        return found; //wird gespeichert in trueOrfalse
    }
}
