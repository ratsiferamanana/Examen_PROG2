package org.Examen_Prog2;

import java.util.List;

public class Song {
    private String id;
    private String title;
    private int duration; // in seconds
    private List<String> genres;
    private Album album;

    public Song(String id, String title, int duration, List<String> genres, Album album) {
        this.id = id;
        this.title = title;
        this.duration = duration;
        this.genres = genres;
        this.album = album;
    }

    // Getters and setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public List<String> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }
}

