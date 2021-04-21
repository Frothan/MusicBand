import java.util.Scanner;

public class Accordion implements iKeyInstrument {
    //VARIABLE's
    String finalInstrument;
    int finalVolume;

    MusicPlayer musicplayer = new MusicPlayer();

    @Override
    public void play(String instrument) {
        musicplayer.playSample(instrument);
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

    @Override
    public void press(String instrument) {
        play(instrument);
    }
}
