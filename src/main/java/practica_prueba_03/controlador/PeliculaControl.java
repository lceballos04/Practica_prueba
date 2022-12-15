/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_prueba_03.controlador;

import java.util.List;
import practica_prueba_03.modelo.Pelicula;
import practica_prueba_03.servicio.PeliculaServiceImpl;

/**
 *
 * @author eceba
 */
public class PeliculaControl {

    private PeliculaServiceImpl peliculaServiceImpl = new PeliculaServiceImpl();

    public String crear(String[] data) {
        var retorno = "No se pudo crear";

      
        var nombrePelicula = data[0];
        var genero = data[1];
        var yearLanzamiento = Integer.valueOf(data[2]);
        var idioma = data[3];
        var duracion = Integer.valueOf(data[4]);

        if (duracion < 0) {
            retorno += "No se puedo crear";
        }else{
            var pelicula = new Pelicula( nombrePelicula, genero, yearLanzamiento, idioma, duracion);
            this.peliculaServiceImpl.crear(pelicula);

            retorno = "Persona=  " + pelicula.getNombrePelicula() + " creada correctamente";
        }

        return retorno;
        }

       

    public List<Pelicula> listar() {
        return this.peliculaServiceImpl.listar();
    }

}
