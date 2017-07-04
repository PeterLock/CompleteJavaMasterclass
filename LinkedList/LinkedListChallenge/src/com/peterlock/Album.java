package com.peterlock;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by macbookpro on 6/30/2017 AD.
 */
public class Album {
    // Create a program that implements a playlist for songs
    // Create a Song class having Title and Duration for a song.
    // The program will have an Album class containing a list of songs.
    // The albums will be stored in an ArrayList
    // Songs from different albums can be added to the playlist and will appear in the list in the order
    // they are added.
    // Once the songs have been added to the playlist, create a menu of options to:-
    // Quit,Skip forward to the next song, skip backwards to a previous song.  Replay the current song.
    // List the songs in the playlist
    // A song must exist in an album before it can be added to the playlist (so you can only play songs that
    // you own).
    // Hint:  To replay a song, consider what happened when we went back and forth from a city before we
    // started tracking the direction we were going.
    // As an optional extra, provide an option to remove the current song from the playlist
    // (hint: listiterator.remove()
    private String name;
    private ArrayList<Song> songs;

    public Album(String name, ArrayList<Song> songs) {
        this.name = name;
        this.songs = songs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public void setSongs(ArrayList<Song> songs) {
        this.songs = songs;
    }

    public boolean addToPlayList(int trackNo, LinkedList<Song> playlist){
        int index = trackNo -1;
        if(index >= 0 && index <= this.songs.size()){
            playlist.add(this.songs.get(trackNo));
            return true;
        }
        System.out.println("Couldnt add song to playlist");
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playlist){
        String searchTitle = title;
        if(searchTitle.isEmpty()){
            return false;
        }

        for(int i = 0; i < this.songs.size(); i++){
            if(this.songs.get(i).getTitle().equalsIgnoreCase(searchTitle)){
                playlist.add(songs.get(i));
                return true;
            }
        }
        return false;
    }
}
















