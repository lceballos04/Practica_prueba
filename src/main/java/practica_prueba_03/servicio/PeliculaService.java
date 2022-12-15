/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_prueba_03.servicio;

import java.util.List;
import practica_prueba_03.modelo.Pelicula;

/**
 *
 * @author eceba
 */
public interface PeliculaService {
  
    public void crear(Pelicula pelicula);
    public Pelicula buscarPorCodigo(int codigo);
    public List<Pelicula> listar();
    
}
