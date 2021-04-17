import java.io.*;

abstract class MusicInstrument {

    String[] genres = {"Rock","Blues","Klassik","Pop","Country",
                       "HipHop","Jazz","Metal","Techno"};

    //Variable die von User eingegeben werden muss:
    public String i = null;

    //not sure if return type is correct...
    public abstract void play();
    public abstract void setVolume();
    public abstract void getName();
    public abstract void getPlayTime();

    System.out.println(genres[1]);
    System.out.println(parameter)
    //public String getGenre(i){
     //   genres[i];
    //}




    public abstract void stopPlay();
}
