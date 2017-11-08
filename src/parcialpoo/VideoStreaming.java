/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialpoo;

import java.util.ArrayList;

/**
 *
 * @author equipo
 */
public class VideoStreaming {
    private Video video;
    private  ArrayList<Pelicula> peliculas; 

    public VideoStreaming(Video video, int i ) {
        this.video = video;
        this.peliculas = new ArrayList<>(); 
    }
    
    
    public void showInfo ( Pelicula pelicula){
        String info=""; 
        info=pelicula.returnInfo(); 
        System.out.println(info);
        
    }
}
