import java.util.Scanner;

public class User {
    Scanner scanner = new Scanner(System.in);  // Create a Scanner object

    public static void main(String[] args) {

        Accordion myAccordion = new Accordion();
        Piano myPiano = new Piano();



        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        String user = "";
        String input = "";

        Settings musicSettings = new Settings();


        do {
            System.out.println("To play an instrument please choose from one of the following genres:");
            System.out.println("List of two instruments . .  " + "Piano and Accordion ");
            input = scanner.nextLine().toLowerCase();
            if (input.equals("piano")) {
                Accordion instAccordion = new Accordion();
                instAccordion.play();
            }

            if (input.equals("accordion")) {
                Piano instPiano = new Piano();
                instPiano.play();
            }
          //  Settings musicSetting = new Settings();
          //  musicSetting.getGenre();
          //  System.out.println("List of genres" + " ");
            System.out.println("To end the program please enter end:");
            System.out.println("---------------------------------------------------");

        }
        while (!input.equals("end"));
    }
}