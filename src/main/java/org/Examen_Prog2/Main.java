package org.Examen_Prog2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> rockGenres = List.of("Rock");
        List<String> popGenres = List.of("Bagasy");
        List<String> metalGenres = List.of("Melody");


        Song song1 = new Song("1", "Ambondrona", 210, rockGenres, null);
        Song song2 = new Song("2", "Randratelo", 180, popGenres, null);
        Song song3 = new Song("3", "Melody", 200, metalGenres, null);

        // Création d'un album avec des chansons
        List<Song> albumSongs = List.of(song1, song2);
        Album album = new Album("1", "Album One", new Date(), albumSongs, null);

        // Création d'un artiste solo
        SoloArtist artist = new SoloArtist("1", "Artist One", 2000, "Country", "John", "Doe", new Date());


        song1 = new Song("1", "Song One", 210, rockGenres, album);
        song2 = new Song("2", "Song Two", 180, popGenres, album);


        PlayList playlist1 = new PlayList("1", "Playlist One");
        PlayList playlist2 = new PlayList("2", "Playlist Two");


        User user1 = new User("1", "User One");
        User user2 = new User("2", "User Two");


        playlist1.addToPlaylist(song1);
        playlist1.addToPlaylist(song2);
        playlist2.addToPlaylist(song3);


        user1.addFavoritePlaylist(playlist1);
        user2.addFavoritePlaylist(playlist2);


        playlist1.like(user1);
        System.out.println("Total likes for Playlist One: " + playlist1.getTotalLikes());

        playlist1.like(user1);
        System.out.println("Total likes for Playlist One: " + playlist1.getTotalLikes());


        List<String> excludeGenres = List.of("Rock");
        PlayList filteredPlaylist = playlist1.exclude(excludeGenres);
        System.out.println("Filtered Playlist Songs: ");
        for (Song song : filteredPlaylist.getSongs()) {
            System.out.println(" - " + song.getTitle());
        }


        System.out.println("Count of Playlist One in other playlists: " + playlist1.countPlaylist(List.of(playlist1, playlist2))); // Devrait afficher 1
    }
}

