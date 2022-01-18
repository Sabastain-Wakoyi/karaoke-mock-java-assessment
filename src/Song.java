import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Song {

    private String title;
    private String artist;
    private List<String> lyrics;

    public Song(String title, String artist, List<String> lyrics) {
        this.title = title;
        this.artist = artist;
        this.lyrics = lyrics;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public List<String> getLyrics() {
        return lyrics;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setLyrics(List<String> lyrics) {
        this.lyrics = lyrics;
    }

    public static List<String> parseLyrics(String lyrics){
        List<String> songs = new LinkedList<>();
        String[] pastlyrics = lyrics.split(" ");
        for(String words: pastlyrics){
            songs.add(words);
        }
        return songs;
    }

}
