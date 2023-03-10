public class playlistTester {
    public static void main(String[] args){
        System.out.println();
        System.out.println("Initializing playlist...");
        System.out.println();
        System.out.println("Adding songs to the playlist...");
        System.out.println();
        Playlist bops = new Playlist();
        Song one = new Song("Glimpse of Us", "Joji", "3:53");
        bops.addSong(one);
        System.out.println("Added \"Glimpse of us\" by Joji (3:53)");
        Song two = new Song("Solamente", "Tai Verdes", "2:15");
        bops.addSong(two);
        System.out.println("Added \"Solamente\" by Tai Verdes (2:15)");
        Song three = new Song("505", "Artic Monkeys", "4:14");
        bops.addSong(three);
        System.out.println("Added \"505\" by Artic Monkeys (4:14)");
        Song four = new Song("Golden Light", "STRFKR", "4:43");
        bops.addSong(four);
        System.out.println("Added \"Golden Light\" by STRFKR (4:43)");
        Song five = new Song("The Real Slim Shady", "Eminem", "4:44");
        bops.addSong(five);
        System.out.println("Added \"The Real Slim Shady\" by Eminem (4:44)");
        System.out.println();
        System.out.println("Printing playlist...");
        System.out.println();
        bops.getPlaylist();
        System.out.println();
        System.out.println("Liking \"Solamente\" and \"The Real Slim Shady\"...");
        bops.likeSong(1);
        bops.likeSong(4);
        System.out.println();
        System.out.println("Printing playlist...");
        System.out.println();
        bops.getPlaylist();
        System.out.println();
        System.out.println("Printing total playlist duration...");
        System.out.println();
        System.out.println(bops.getTotal());
        System.out.println("Removing \"505\" from the playlist...");
        bops.removeSong(2);
        System.out.println();
        System.out.println("Printing playlist...");
        System.out.println();
        bops.getPlaylist();
        System.out.println();
        System.out.println("Printing only the liked songs...");
        System.out.println();
        bops.getLikedSongs();
        System.out.println();
        System.out.println("Removing liked songs...");
        bops.removeLiked();
        System.out.println();
        System.out.println("Printing playlist...");
        System.out.println();
        bops.getPlaylist();
    }
}
