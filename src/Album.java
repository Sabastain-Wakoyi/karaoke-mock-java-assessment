import java.util.List;

public class Album {
    private String name;
    private List<Song> songs;

    public Album(String name, List<Song> songs) {
        this.name = name;
        this.songs = songs;
    }

    public String getName() {
        return name;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }

    public void printTrackListings(){
        System.out.println(name);
        for(Song song: songs){
            System.out.println(song.getTitle()+ " "+ song.getArtist());
        }
    }
}
