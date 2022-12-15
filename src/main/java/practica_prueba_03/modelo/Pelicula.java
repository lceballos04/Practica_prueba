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

    private int codigoPelicula;
    private String nombrePelicula;
    private String genero;
    private int yearLanzamiento;
    private String idioma;
    private String clasificacion;
    private int duracion;

    public Pelicula(int codigoPelicula, String nombrePelicula, String genero, int yearLanzamiento, String idioma, String clasificacion, int duracion) {
        this.codigoPelicula = codigoPelicula;
        this.nombrePelicula = nombrePelicula;
        this.genero = genero;
        this.yearLanzamiento = yearLanzamiento;
        this.idioma = idioma;
        this.clasificacion = clasificacion;
        this.duracion = duracion;
    }

    public String getClasificacionEdad() {
        var retorno = "Desconocido";
        switch (clasificacion) {
            case "A":
                retorno = "Apto para todo publico";
                break;

            case "B":
                retorno = "Apto bajo supervicion de un adulto";
                break;

            case "E":
                retorno = "Contenido entretenimiento";
                break;

            case "I":
                retorno = "Contenido informativo";
                break;
            default:
                throw new AssertionError();

        }

        return retorno;
    }

    public int getCodigoPelicula() {
        return codigoPelicula;
    }

    public void setCodigoPelicula(int codigoPelicula) {
        this.codigoPelicula = codigoPelicula;
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

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Persona{" + "codigoPelicula=" + codigoPelicula + ", nombrePelicula=" 
                + nombrePelicula + ", genero=" + genero + ", yearLanzamiento=" 
                + yearLanzamiento + ", idioma=" + idioma + ", clasificacion=" 
                + clasificacion +", la pelicula tiene clasificacion:" + this.getClasificacionEdad()
                + ", duracion=" + duracion +"horas"+ '}';
    }

   
}
