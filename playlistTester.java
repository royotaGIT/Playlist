public class playlistTester {
    public static void main(String[] args){
        System.out.println("Initializing playlist...");
        Playlist bops = new Playlist();
        Song one = new Song("Glimpse of Us", "Joji", "3:53");
        bops.addSong(one);
        bops.likeSong(0);
        bops.getPlaylist();
    }
}
