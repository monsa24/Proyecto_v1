package com.proyecto.service;

import com.proyecto.domain.Perrito;
import java.util.List;

public interface PerritoService {
    
    //se obtiene un listado de categorias en un List
    public List <Perrito> getPerritos(boolean activos);
    
    //Se obtiene una categoria por medio de su ID
    public Perrito getPerrito(Perrito perrito);
    
    //metodo de guardar
    public void save(Perrito perrito);
    
    //Metodo de eliminar
    public void delete(Perrito perrito);
}