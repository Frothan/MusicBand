public class Starter {
    public static void main(String[] args) {
        //create objects:
        User myUser = new User();

        MusicOrganizer organizer= new MusicOrganizer();
        Track myTrack = new Track("a","b","c");

        //call method:
        myUser.userStart();
    }
}
