/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_preuba_03.controlador;

import java.util.List;
import practica_prueba_03.modelo.Pelicula;
import practica_prueba_03.servicio.PeliculaServiceImpl;

/**
 *
 * @author eceba
 */
public class PeliculaControl {

    private PeliculaServiceImpl peliculaServiceImpl ;
    
    public PeliculaControl() {
        this.peliculaServiceImpl = new PeliculaServiceImpl();
    }

    public void crear(String[] data) {
        

        var codigoPelicula = Integer.valueOf(data[0]);
        var nombrePelicula = data[1];
        var genero = data[2];
        var yearLanzamiento = Integer.valueOf(data[3]);
        var idioma = data[4];
        var clasificacion = data[5];
        var duracion = Integer.valueOf(data[6]);

        var pelicula = new Pelicula(codigoPelicula, nombrePelicula, genero, yearLanzamiento, idioma, clasificacion, duracion);
        this.peliculaServiceImpl.crear(pelicula);

    }


    public List<Pelicula> listar() {
        return this.peliculaServiceImpl.listar();
    }

}
