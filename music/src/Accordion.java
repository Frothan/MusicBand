import java.util.Scanner;

public class Accordion implements iKeyInstrument {
    //VARIABLE's
    String name;
    int volume;

    @Override
    public void press() {

    }

    @Override
    public void play() {
        //
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public void setName(String instrument) {
        this.name = instrument;
    }

    @Override
    public void setPlayTime() {

    }

    @Override
    public void stopPlay() {

    }
}
