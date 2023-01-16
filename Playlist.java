import java.util.*;
public class Playlist{
    public ArrayList<Song> playlist = new ArrayList<Song>();
    public void getPlaylist(){
        for(Song x:playlist){
            if(x.isLiked()){System.out.print("❤️ ");}else{System.out.print("- ");}
            System.out.println("\"" + x.getTitle() + "\" by " + x.getArtist() + " (" + x.getDuration() + ")");}}
    public void getLikedSongs(){
        for(Song x:playlist){
            if(x.isLiked()){System.out.println("❤️ \"" + x.getTitle() + "\" by " + x.getArtist() + " (" + x.getDuration() + ")");}}}
    public void addSong(Song song){playlist.add(song);}
    public void removeSong(int i){playlist.remove(i);}
    public void likeSong(int i){
        if(i>=0 && i<playlist.size()){
        Song song = playlist.get(i);
        song.like();
        }else{System.out.println("No song with that index!");}}
    public String getTotal(){
        int count = 0;
        for(Song x:playlist){
            String wordNum = x.getDuration();
            int min = Integer.parseInt(wordNum.substring(0,1));
            int sec = Integer.parseInt(wordNum.substring(2));
            count = count + sec + min*60; }
        String finalMin = Integer.toString(count/60);
        String finalSec;
        int sec = count%60;
        if(sec<10){finalSec  = "0" + Integer.toString(sec);}else{finalSec = Integer.toString(sec);}
        String finalTime = finalMin + ":" + finalSec;
        return finalTime;}
    public void removeLiked(){
        for(int i=0;i<playlist.size();i++){if(playlist.get(i).isLiked()){playlist.remove(i);i--;}}}}
