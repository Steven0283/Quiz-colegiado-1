/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colegiado.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author steve
 */
public class Cancion {
    
    private int songID;
    private String title;
    private String author;
    private int duration;
    private int releaseYear;

    public Cancion() {
    }

    public Cancion(int songID, String title, String author, int duration, int releaseYear) {
        this.songID = songID;
        this.title = title;
        this.author = author;
        this.duration = duration;
        this.releaseYear = releaseYear;
    }

    public int getSongID() {
        
        return songID;
    }

    public void setSongID(int songID) {
            
        this.songID = songID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        
        this.author = author;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        
        this.duration = duration;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        
        this.releaseYear = releaseYear;
    }
    
    
}
