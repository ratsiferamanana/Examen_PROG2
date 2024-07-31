package org.Examen_Prog2;

import java.util.ArrayList;

import java.util.List;

public class PlayList {
    private String id;
    private String name;
    private List<Song> songs;
    private List<User> likedBy;

    public PlayList(String id, String name) {
        this.id = id;
        this.name = name;
        this.songs = new ArrayList<>();
        this.likedBy = new ArrayList<>();
    }

    public void addToPlaylist(Song song) {
        songs.add(song);
    }

    public void addToPlaylist(Album album) {
        songs.addAll(album.getSongs());
    }

    public void removeById(String songId) {
        songs.removeIf(song -> song.getId().equals(songId));
    }

    public void like(User user) {
        if (likedBy.contains(user)) {
            likedBy.remove(user);
        } else {
            likedBy.add(user);
        }
    }

    public PlayList exclude(List<String> genres) {
        PlayList newPlaylist = new PlayList(this.id, this.name);
        for (Song song : songs) {
            boolean exclude = false;
            for (String genre : genres) {
                if (song.getGenres().contains(genre)) {
                    exclude = true;
                    break;
                }
            }
            if (!exclude) {
                newPlaylist.addToPlaylist(song);
            }
        }
        return newPlaylist;
    }

    public int countPlaylist(List<PlayList> playlists) {
        int count = 0;
        for (PlayList playlist : playlists) {
            if (playlist.getSongs().contains(this)) {
                count++;
            }
        }
        return count;
    }



    public int getTotalLikes() {
        return likedBy.size();
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

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }

    public List<User> getLikedBy() {
        return likedBy;
    }

    public void setLikedBy(List<User> likedBy) {
        this.likedBy = likedBy;
    }
}
