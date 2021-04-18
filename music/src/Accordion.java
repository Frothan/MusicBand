public class Accordion implements iKeyInstrument {

    @Override
    public void play() {

    }

    @Override
    public void setVolume() {

    }

    @Override
    public int setVolume(String instrument) {
        int volume = scanner.nextInt(); // Read user input
        return volume;

        //--------------------------------------------------------------------------------------------------------------
        //Das Kann in User Class übernommen werden!
        if (volume > 80){
            System.out.println("Wow, " + volume + "% of " + instrument + ", that's loud! Let's Party!");
        }else if(volume < 30){
            System.out.println(volume + "% of " + instrument + " that's quiet...");
        }else{
            System.out.println("Volume of ss " + instrument + ": " + volume + "%");
        }
        //--------------------------------------------------------------------------------------------------------------

    }

    @Override
    public void getName() {
        String name = scanner.nextLine(); // Read user input
    }

    @Override
    public void setPlayTime() {

    }


}

    @Override
    public void stopPlay() {

    }

    @Override
    public void press() {

    }
}
