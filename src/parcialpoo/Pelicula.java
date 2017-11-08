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
public class Pelicula extends Video {
    private ArrayList <Actor> actores; 

    public Pelicula(String titulo, String director, int año) {
        super(titulo, director, año);
        this.actores= new ArrayList<>();
    }

    public ArrayList<Actor> listarActores() {
        return actores;
    }

    
    @Override
    public String returnInfo() {
        String info= ""; 
        info= this.titulo+ "/n"+ this.director+"/n"+this.año+ "/n"+ this.actores+"/n"; 
        return info; 
    }
        
    
   

  
    

    
   
   

    
    
    
}
