import java.util.Locale;
import java.util.Scanner;

abstract class MusicInstrument {

    String[] genresA = {"rock","blues","klassik","pop","country",
                       "HipHop","Jazz","Metal","Techno"};
    Scanner scanner = new Scanner(System.in);  // Create a Scanner object
    String input;

    //Variable die von User eingegeben werden muss:
    public String i = null;

    //not sure if return type is correct...
    public abstract void play();
    public abstract void setVolume();
    public abstract void getName();
    public abstract void getPlayTime();

//=================================================================================================================START
// G E N R E
    public void getGenre(){
        //--------------------------------------------------------------------------------------------------------------
        //Das Kann in User Class übernommen werden!
        System.out.println("Welches Genre möchtest du hören?");
        //getGenre() aufrufen
        //--------------------------------------------------------------------------------------------------------------

        String input = scanner.nextLine().toLowerCase();  // Read user input
        existGenre(input);
    }

    //Überprüft, ob im Array vorhanden ist 1/2
    public void existGenre(String input){
        boolean trueOrfalse = contains(genresA, input); //Methode wird aufgerufen

        //--------------------------------------------------------------------------------------------------------------
        //Das Kann in User Class übernommen werden!
        if(trueOrfalse = true){
            System.out.println("Super, du möchtest " + input + " hören.");  // Output user input
        }else{
            System.out.println("Das Genre " + input + " existiert nicht. \n Möchtest Du die Auswahl ansehen? (J/N)");
            String inputJN = scanner.nextLine();
            if(inputJN == "J"){
                for (String genre : genresA) {
                    System.out.println(genresA + "\n");
                }
                System.out.println("Gib ein Genre ein, dass zur Auswahl steht: ");
                String inputGenre2 = scanner.nextLine();
                existGenre(input);
            }else{
                System.out.println("Okay, tschüss.");
            }
        }
        //--------------------------------------------------------------------------------------------------------------
    }

    //Überprüft, ob input konkret im Array vorhanden ist! 2/2
    protected boolean contains(String[] genresA, String input){
        boolean found = false;
        for(int i = 0; i < genresA.length; i++) {
            if(genresA[i]==input) {
                found=true;
            }
        }
        return found; //wird gespeichert in trueOrfalse
    }
//===================================================================================================================END

    public abstract void stopPlay();
}
