public class Song{
    String title;
    String artist;
    String duration;
    boolean liked = false;
    public Song(String myTitle, String myArtist, String myDuration){title=myTitle;artist=myArtist;duration=myDuration;}
    public String getTitle(){return title;}
    public String getArtist(){return artist;}
    public String getDuration(){return duration;}
    public boolean isLiked(){return liked;}
    public void like(){liked = true;}
    public void unLike(){liked = false;}
}
