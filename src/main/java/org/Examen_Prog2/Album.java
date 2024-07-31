package org.Examen_Prog2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Album {
    private String id;
    private String name;
    private Date releaseDate;
    private List<Song> songs;
    private Artist artist;

    public Album(String id, String name, Date releaseDate, List<Song> songs, Artist artist) {
        this.id = id;
        this.name = name;
        this.releaseDate = releaseDate;
        this.songs = new ArrayList<>();
        this.artist = artist;
    }

    // Getters and setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }
}

