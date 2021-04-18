import java.util.Scanner;

abstract class MusicInstrument {

    String[] genresA = {"rock","blues","klassik","pop","country",
                       "HipHop","Jazz","Metal","Techno"};
    Scanner scanner = new Scanner(System.in);  // Create a Scanner object

    //Variable die von User eingegeben werden muss:
    public String i = null;

    //not sure if return type is correct...
    public abstract void play();
    public abstract void setVolume();
    public abstract void getName();
    public abstract void getPlayTime();

    public void getGenre(){
        System.out.println("Welches Genre möchtest du hören?");
        String input = scanner.nextLine();  // Read user input
        existGenre(input).toLowerCase();
    }

    public String existGenre(String input){
        boolean trueOrfalse = contains(genresA, input);
        if(trueOrfalse = true){
            System.out.println("Super, du möchtest " + input + " hören.");  // Output user input
        }else{
            System.out.println("Das Genre " + input + " existiert nicht. \n Möchtest Du die Auswahl ansehen? (J/N)");
            String inputJN = scanner.nextLine();
            if(inputJN == "J"){
                for (String genre : genresA) {
                    System.out.println(genresA"\n")
                }
                System.out.println("Gib ein Genre ein, dass zur Auswahl steht: ");
                String inputGenre2 = scanner.nextLine();
            }
        }
    }

        //if okay --> Meldung
        //else --> Meldunf dieses Genre exisitiert nicht, Möchtest du die Liste sehen?









    public abstract void stopPlay();
}
