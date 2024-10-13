package com.examen.LP2_T2.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examen.LP2_T2.modelo.AreaEntidad;

@Repository
public interface AreaRepositorio extends JpaRepository<AreaEntidad, Integer>{

}
