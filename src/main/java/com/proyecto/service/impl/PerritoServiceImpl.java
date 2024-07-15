package com.proyecto.service.impl;

import com.proyecto.dao.PerritoDao;
import com.proyecto.domain.Perrito;
import com.proyecto.service.PerritoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service  //pertenece a la capa de SERVICIOS
//implement porque implementamos una interface Service
public class PerritoServiceImpl implements PerritoService {

    //vamos a utilizar el PerritoDao porque tiene toda la info del primary key y BD
    @Autowired
    private PerritoDao perritoDao;

    @Override
    @Transactional(readOnly = true)
    public List<Perrito> getPerritos(boolean activos) {
        var lista = perritoDao.findAll();
        if (activos) {
            lista.removeIf(e -> !e.isAdopcion());
        }
        return lista;
    }

    @Override
    @Transactional(readOnly = true)
    public Perrito getPerrito(Perrito perrito) {
        return perritoDao.findById(perrito.getIdNumero()).orElse(null);

    }

    @Override
    @Transactional
    //guarda y actualiza: SAVE
    public void save(Perrito perrito) {
        perritoDao.save(perrito);
    }

    @Override
    @Transactional
    public void delete(Perrito perrito) {
        perritoDao.delete(perrito);
    }

}
