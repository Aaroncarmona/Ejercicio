package mx.com.iubix.ejercicio.models;

/**
 * Created by raily on 12/05/2017.
 */

public class Cancion {

    private String songName;
    private String songArtist;
    private int    stars;

    public Cancion( String songName , String songArtist , int stars ){
        this.songName = songName;
        this.songArtist = songArtist;
        this.stars = stars;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getSongArtist() {
        return songArtist;
    }

    public void setSongArtist(String songArtist) {
        this.songArtist = songArtist;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }
}
