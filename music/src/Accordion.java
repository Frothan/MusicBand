import java.util.Scanner;

public class Accordion implements iKeyInstrument {
    //VARIABLE's
    String finalInstrument;
    int finalVolume;

    @Override
    public void press() {

    }

    @Override
    public void play() {

    }

    @Override
    public void setVolume(int volume) {
        finalVolume = volume;
    }

    @Override
    public void setName(String instrument) {
        this.finalInstrument = instrument;
    }

    @Override
    public void setPlayTime() {

    }

    @Override
    public void stopPlay() {

    }
}
