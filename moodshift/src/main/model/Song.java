package model;

import org.json.JSONObject;
import persistence.Writable;

// Represents a song having a title, artist, year of release, genre, and release period
public class Song implements Writable {
    private String title;
    private String artist;
    private int releaseYear;
    private String emotion1;
    private String emotion2;

    // REQUIRES: title, artist, genre, and release have a non-zero length AND year >= 0
    // EFFECTS: constructs a song with given title, artist, year (of release), genre, and release (period)
    public Song(String title, String artist, int year, String emotion1, String emotion2) {
        this.title = title;
        this.artist = artist;
        this.releaseYear = year;
        this.emotion1 = emotion1;
        this.emotion2 = emotion2;
    }

    // EFFECTS: returns title of the song
    public String getTitle() {
        return title;
    }

    // EFFECTS: returns artist of the song
    public String getArtist() {
        return artist;
    }

    // EFFECTS: returns year of release of the song
    public int getReleaseYear() {
        return releaseYear;
    }

    // EFFECTS: returns genre of the song
    public String getEmotion1() {
        return emotion1;
    }

    // EFFECTS: returns release period of the song
    public String getReleasePeriod() {
        return emotion2;
    }

    @Override
    public JSONObject toJson() {
        JSONObject json = new JSONObject();

        json.put("title", title);
        json.put("artist", artist);
        json.put("year", releaseYear);
        json.put("genre", emotion1);
        json.put("release", emotion2);

        return json;
    }
}