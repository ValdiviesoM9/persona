/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.ejemplo.ejemplo.controller;

import ec.edu.espe.distribuidas.ejemplo.ejemplo.modelo.Producto;
import ec.edu.espe.distribuidas.ejemplo.ejemplo.repositorio.ProductoDAO;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author mikeq
 */
@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT,
		RequestMethod.DELETE })
@RequestMapping("/api/producto")

public class ProductoController {
    
    @Autowired
    private ProductoDAO repository;
    
    @PostMapping("/producto")
    public Producto create(@Validated @RequestBody Producto p){
    return repository.insert(p);
    }
    
    @GetMapping("/")
    public List<Producto> readAll(){
    return repository.findAll();
    }
    
      @PutMapping("/producto/{id}")
    public Producto update(@PathVariable String id,@Validated @RequestBody Producto p){
    return repository.save(p);
    }
    
    @DeleteMapping("/producto/{id}")
    public void delete (@PathVariable String id){
        repository.deleteById(id);
    } 
}

