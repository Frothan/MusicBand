public class ElectricGuitare implements iStringInstrument {
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
    public void striking(String instrument, int playtime) {
        System.out.println("Rock and Roll! Yeaah!!!");
        play(instrument);
    }
}


