import javazoom.jl.player.PlayerApplet;
import javazoom.jl.player.advanced.AdvancedPlayer;

public interface iMusicInstrument {

    PlayerApplet myAccordion = new PlayerApplet();

    void play();
    int setVolume(String instrument);
    void getName();
    void setPlayTime();
    void stopPlay();

}

