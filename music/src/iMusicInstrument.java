import javazoom.jl.player.advanced.AdvancedPlayer;

public interface iMusicInstrument {

    AdvancedPlayer myAccordion = new AdvancedPlayer();

    void play();
    int setVolume(String instrument);
    void getName();
    void setPlayTime();
    void stopPlay();

}

