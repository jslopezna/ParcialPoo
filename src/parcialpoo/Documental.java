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
public class Documental extends Video {

    private String genero;

    public Documental(String genero, String titulo, String director, int año) {
        super(titulo, director, año);
        this.genero = genero;
    }

    @Override
    public String returnInfo() {
 String info= ""; 
        info= this.titulo+ "/n"+ this.director+"/n"+this.año+ "/n"+ this.genero+"/n"; 
        return info;     }

}
