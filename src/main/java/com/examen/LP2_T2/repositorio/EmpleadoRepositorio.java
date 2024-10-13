package com.examen.LP2_T2.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examen.LP2_T2.modelo.EmpleadoEntidad;

@Repository
public interface EmpleadoRepositorio extends JpaRepository<EmpleadoEntidad, String>{

	EmpleadoEntidad findByDniEmpleado(String dniEmpleado);
}
