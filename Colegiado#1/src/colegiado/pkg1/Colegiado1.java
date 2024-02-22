/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colegiado.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author steve
 */
public class Colegiado1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cancion cancion1 = new Cancion();
        Cancion cancion2 = new Cancion(0, "" , "", 0, 0);
        
        JOptionPane.showMessageDialog(null, "Bienvenido al sistema de canciones de Spotify \n"
                + "Por favor ingrese los datos que se le solicitarán a continuación");
        
        cancion1.setSongID(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID de la canción: ")));
        cancion1.setTitle(JOptionPane.showInputDialog("Ingrese el Título de la canción: "));
        cancion1.setAuthor(JOptionPane.showInputDialog("Ingrese el nombre del autor de la canción: "));
        cancion1.setDuration(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la duración de la canción: ")));
        cancion1.setReleaseYear(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año en que se estrenó la canción: ")));
        
        JOptionPane.showMessageDialog(null, "Los datos de la cancion son \n"
                + "ID de la canión: " +cancion1.getSongID()+ " \n"
                + "Nombre de la canción: " +cancion1.getTitle()+ "\n"
                + "Nombre del autor: " +cancion1.getAuthor()+ "\n"
                + "Duracion de la canción: " +cancion1.getDuration()+ " minutos \n"
                + "Año de lanzamiento: " +cancion1.getReleaseYear());
    }
}
