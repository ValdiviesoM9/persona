/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.ejemplo.ejemplo.repositorio;

import ec.edu.espe.distribuidas.ejemplo.ejemplo.modelo.Producto;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author mikeq
 */

@Repository

public interface ProductoDAO extends MongoRepository <Producto, String> {

  
    
}
