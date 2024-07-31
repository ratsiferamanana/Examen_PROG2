package org.Examen_Prog2;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String id;
    private String name;
    private List<PlayList> favoritePlaylists;

    public User(String id, String name) {
        this.id = id;
        this.name = name;
        this.favoritePlaylists = new ArrayList<>();
    }

    public void addFavoritePlaylist(PlayList playlist) {
        if (favoritePlaylists.contains(playlist)) {
            favoritePlaylists.remove(playlist);
        } else {
            favoritePlaylists.add(playlist);
        }
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

    public List<PlayList> getFavoritePlaylists() {
        return favoritePlaylists;
    }

    public void setFavoritePlaylists(List<PlayList> favoritePlaylists) {
        this.favoritePlaylists = favoritePlaylists;
    }
}

