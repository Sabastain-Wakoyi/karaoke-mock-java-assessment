import java.io.IOException;

public class MusicPlayer extends  Player{
    private String voice;

    public MusicPlayer(String voice) {
        this.voice = voice;
    }

    public MusicPlayer() {
        voice = "";
    }

    @Override
    public void play(Album album) {

    }

    @Override
    public void play(Song song) {
        Runtime r = Runtime.getRuntime();
        try {
            Thread.sleep(MusicPlayer.INTRO_PAUSE);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for(String lines: song.getLyrics()){
           for(String words: Song.parseLyrics(lines)){
               try {
                   r.exec("say "+words);
                   Thread.sleep(MusicPlayer.WORD_CADENCE);
               } catch (IOException | InterruptedException e) {
                   e.printStackTrace();
               }
           }
        }
    }

}
