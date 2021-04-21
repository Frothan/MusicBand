public class Guitare implements iStringInstrument{

    MusicPlayer musicplayer = new MusicPlayer();

    @Override
    public void play(String instrument) {
        musicplayer.playSample(instrument);
    }

    @Override
    public void setVolume(int volume) {

    }

    @Override
    public void setName(String instrument) {

    }

    @Override
    public void setPlayTime() {

    }

    @Override
    public void stopPlay() {

    }

    @Override
    public void striking() {

    }
}
