/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_prueba_03.servicio;

import java.util.ArrayList;
import java.util.List;
import practica_prueba_03.modelo.Pelicula;

/**
 *
 * @author eceba
 */
public class PeliculaServiceImpl implements PeliculaService{
    
    private static List<Pelicula> peliculaList = new ArrayList<>();

    @Override
    public void crear(Pelicula pelicula) {
        this.peliculaList.add(pelicula);
        
    }

    @Override
    public Pelicula buscarPorCodigo(int codigo) {
        Pelicula retorno = null;
        for (var pelicula : this.peliculaList) {
            if (codigo == pelicula.getCodigoPelicula()) {
                retorno = pelicula;
                break;
            }
        }
        return retorno;
    }

    @Override
    public List<Pelicula> listar() {
        return this.peliculaList;
    }

    

       
    

    
}
