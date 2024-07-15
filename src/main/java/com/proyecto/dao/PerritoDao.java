package com.proyecto.dao;

import com.proyecto.domain.Perrito;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PerritoDao extends JpaRepository <Perrito, Long> {

}
