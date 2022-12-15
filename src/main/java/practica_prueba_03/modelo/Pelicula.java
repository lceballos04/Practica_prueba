/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_prueba_03.modelo;

import java.time.LocalDate;

/**
 *
 * @author eceba
 */
public class Pelicula {

    
    private String nombrePelicula;
    private String genero;
    private int yearLanzamiento;
    private String idioma;
    private int duracion;

    public Pelicula(String nombrePelicula, String genero, int yearLanzamiento, String idioma, int duracion) {
        this.nombrePelicula = nombrePelicula;
        this.genero = genero;
        this.yearLanzamiento = yearLanzamiento;
        this.idioma = idioma;
        this.duracion = duracion;
    }

    

    public String getNombrePelicula() {
        return nombrePelicula;
    }

    public void setNombrePelicula(String nombrePelicula) {
        this.nombrePelicula = nombrePelicula;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getYearLanzamiento() {
        return yearLanzamiento;
    }

    public void setYearLanzamiento(int yearLanzamiento) {
        this.yearLanzamiento = yearLanzamiento;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "nombrePelicula=" + nombrePelicula + ", genero=" 
                + genero + ", yearLanzamiento=" + yearLanzamiento + ", idioma=" 
                + idioma + ", duracion=" + duracion + '}';
    }

    
    

    
   
}
