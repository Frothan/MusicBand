import java.util.Scanner;

public class Accordion implements iKeyInstrument {

    Scanner scanner = new Scanner(System.in);

    @Override
    public void press() {

    }

    @Override
    public void play() {

    }

    @Override
    public int setVolume(String instrument) {
        return 0;
    }

    @Override
    public String getName(String name) {
        return name;
    }

    @Override
    public int setPlayTime(int sec) {
        return sec;
    }

    @Override
    public void stopPlay() {

    }
}
