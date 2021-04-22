public class Drums implements iPercussionInstrument{
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
    public void hit(String instrument, int playtime) {
        System.out.println("The Drums are getting hit! Yeaah!!!");
        play(instrument);
    }
}

