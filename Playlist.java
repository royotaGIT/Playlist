import java.util.*;
public class Playlist{
    public ArrayList<Song> playlist = new ArrayList<Song>();
    public void getPlaylist(){
        for(Song x:playlist){
            if(x.isLiked()){System.out.println("❤️");}else{System.out.println("-");}
        }
    }
    public void addSong(Song song){playlist.add(song);}
    public void likeSong(int i){
        if(i>=0 && i<playlist.size()){
        Song song = playlist.get(i);
        song.like();
        }else{System.out.println("No song with that index!");}
    }


      

      /**
       * Methods-- Remember that you need to be able to complete all of the following:
       * Adding a song
       * 'liking' a song
       * Removing a specific song
       * Examining all Songs (a String return or void print makes sense here)
       * Examining a sublist of all liked songs
       * Determining the total duration of all songs
       * Removing all unliked songs from the playlist (careful with this one!)
       */
    
}
