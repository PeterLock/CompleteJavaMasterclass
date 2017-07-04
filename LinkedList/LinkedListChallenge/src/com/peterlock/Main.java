package com.peterlock;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

/**
 * Created by macbookpro on 6/30/2017 AD.
 */
public class Main {

    private static ArrayList<Album> albums = new ArrayList<Album>();
    private static LinkedList<Song> playlist = new LinkedList<Song>();


    public static void main(String[] args) {
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
        albums.add(CCR());
        albums.add(KONGOS());
        albums.add(TheDoors());


        albums.get(0).addToPlayList(1, playlist);
        albums.get(0).addToPlayList("Proud Mary", playlist);

        play(playlist);

    }

    private static void play(LinkedList<Song> playlist) {
        printMenu();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<Song> listIterator = playlist.listIterator();
        while(!quit){
            int action = scanner.nextInt();
            scanner.nextLine();
            switch(action){
                case 0:
                    printMenu();
                    break;
                case 1:
                    printPlaylist();
                    System.out.println();
                    printMenu();
                    break;
                case 2:
                    if(!goingForward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now playing: " + listIterator.next().getTitle());
                    } else{
                        System.out.println("Reached the end of the list");
                        goingForward = false;
                    }
                    break;
                case 3:
                    if(goingForward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now playing: " + listIterator.previous().getTitle());
                    } else{
                        System.out.println("Reached the start of the list");
                        goingForward = true;
                    }
                    break;
                case 4:
                    listIterator.previous();
                    System.out.println("Replaying: " + listIterator.next().getTitle());
                    break;
                case 5:
                    System.out.println(" quit\n");
                    quit = true;
                    break;
            }
        }
    }

    private static void printPlaylist() {
        System.out.println("\nPlaylist contains:");
        for(int i = 0; i < playlist.size(); i++){
            System.out.println("\t" + (i+1) + ". " + playlist.get(i).getTitle() + " : " + playlist.get(i).getDuration());
        }
    }

    private static void printMenu() {
        System.out.println("Available actions: \nPress\n");
        System.out.println("0 - to show menu\n" +
                "1 - to view playlist\n" +
                "2 - to skip to the next song\n" +
                "3 - to go back to the previous song\n" +
                "4 - to replay the song\n" +
                "5 - to quit");
    }

    private static Album CCR() {
        ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song("Proud Mary", 3.07));
        songs.add(new Song("Bad Moon Rising", 2.18));
        songs.add(new Song("Susie Q", 4.35));
        songs.add(new Song("Up Around the Bend", 2.40));
        songs.add(new Song("Run Through the Jungle", 3.09));
        return (new Album("CCR",songs));
    }

    private static Album KONGOS() {
        ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song("Come With Me", 3.32));
        songs.add(new Song("Sex on the Radio", 3.57));
        songs.add(new Song("Escape", 4.34));
        songs.add(new Song("Kids These Days", 3.56));
        songs.add(new Song("As We Are", 4.43));
        return (new Album("KONGOS", songs));
    }

    private static Album TheDoors() {
        ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song("Break On Through (To The Other Side)", 2.27));
        songs.add(new Song("Light My Fire", 7.07));
        songs.add(new Song("Hello, I Love You", 2.13));
        songs.add(new Song("Love Her Madly", 3.17));
        songs.add(new Song("Riders On The Storm", 6.57));

        return (new Album("The Doors Greatest Hits", songs));
    }
}
