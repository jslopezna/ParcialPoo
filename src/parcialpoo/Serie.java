/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialpoo;

/**
 *
 * @author equipo
 */
public class Serie extends Video {
    private int numeroCapitulos; 
    private int numeroTemporada; 

    public Serie(int numeroCapitulos, int numeroTemporada, String titulo, String director, int año) {
        super(titulo, director, año);
        this.numeroCapitulos = numeroCapitulos;
        this.numeroTemporada = numeroTemporada;
    }

    @Override
    public String returnInfo() {
         String info= ""; 
        info= this.titulo+ "/n"+ this.director+"/n"+this.año+ "/n"+ this.numeroTemporada+"/n"+this.numeroCapitulos+"/n"; 
        return info; 
    }
    
    
    
}
