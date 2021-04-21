public class Saxophone implements iBrassInstrument{
    //VARIABLE's
    String name;
    int playtime;
    int volume;

    MusicPlayer musicplayer = new MusicPlayer();

    @Override
    public void play(String instrument) {
        musicplayer.playSample(instrument);
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
    public void setPlayTime(int playtime) {
        this.playtime = playtime;
    }

    @Override
    public void stopPlay() {

    }

    @Override
    public void blow(String instrument) {
        play(instrument);
    }
}
